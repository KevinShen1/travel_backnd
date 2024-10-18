package com.travel.controller;

import com.travel.mapper.VwUserAuthRolesMapper;
import com.travel.model.TbSysUser;
import com.travel.model.VwUserAuthRoles;
import com.travel.service.LoginService;
import com.travel.vo.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private LoginService loginService;

    @Autowired
    private VwUserAuthRolesMapper vwUserAuthRolesMapper;

    @PostMapping("/getUserAuth")
    public ResponseVo getUserAuth(@RequestBody VwUserAuthRoles obj) {

        ResponseVo responseVo = new ResponseVo();
        Map<String, Object> resultMap = new HashMap<>();
        try {

            if(loginService.checkUserInfo(obj).equals("pwd_error")) {
                responseVo.setStatus(false);
                responseVo.setMessage("帳號或密碼輸入錯誤");
                return responseVo;
            }else if(loginService.checkUserInfo(obj).equals("unregistered")) {
                responseVo.setStatus(false);
                responseVo.setMessage("此帳號未註冊或啟用，請洽系統管理員");
                return responseVo;
            }

            VwUserAuthRoles vwUserAuthRoles = loginService.getUserAuthByUserId(obj.getUserId());


            resultMap.put("userInfo", vwUserAuthRoles);
            resultMap.put("funcAuth", loginService.getUserProgAuth(obj.getUserId(), "root"));
            responseVo.setStatus(true);
            responseVo.setData(resultMap);


        }catch (Exception e) {
            responseVo.setStatus(false);
            logger.error(e.getMessage());
        }
        return responseVo;
    }

    @PostMapping("/getUserAuthByUserId")
    public ResponseVo getUserAuthByUserId(@RequestBody String userId) {
        ResponseVo responseVo = new ResponseVo();
        try{
            Map<String, Object> resultMap = new HashMap<>();


            VwUserAuthRoles vwUserAuthRoles = loginService.getUserAuthByUserId(userId);
            if(vwUserAuthRoles == null) {
                responseVo.setStatus(false);
            }else {
                resultMap.put("userInfo", vwUserAuthRoles);
                resultMap.put("funcAuth", loginService.getUserProgAuth(userId, "root"));
                responseVo.setStatus(true);
                responseVo.setData(resultMap);
            }

        }catch (Exception e) {
            responseVo.setStatus(false);
            logger.error(e.getMessage());
        }
        return responseVo;
    }
}

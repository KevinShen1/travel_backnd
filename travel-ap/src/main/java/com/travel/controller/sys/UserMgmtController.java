package com.travel.controller.sys;

import com.travel.model.TbSysRole;
import com.travel.model.TbSysUser;
import com.travel.model.VwUserAuthRoles;
import com.travel.service.sys.UserMgmtService;
import com.travel.vo.ProgTreeVo;
import com.travel.vo.ResponseVo;
import com.travel.vo.SaveUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserMgmtController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    UserMgmtService userMgmtService;

    @PostMapping("/userMgmt/queryUserList")
    public ResponseVo queryUserList() {
        ResponseVo responseVo = new ResponseVo();
        try{
            List<VwUserAuthRoles> data = userMgmtService.queryUserList();
            responseVo.setStatus(true);
            responseVo.setData(data);
        }catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }

    @PostMapping("/userMgmt/queryRoleList")
    public ResponseVo queryRoleList() {
        ResponseVo responseVo = new ResponseVo();
        try{
            List<TbSysRole> data = userMgmtService.queryRoleList();
            responseVo.setStatus(true);
            responseVo.setData(data);
        }catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }

    @PostMapping("/userMgmt/queryAllProgList")
    public ResponseVo queryAllProgList() {
        ResponseVo responseVo = new ResponseVo();
        try{
            List<ProgTreeVo> data = userMgmtService.queryAllProgList("root");
            responseVo.setStatus(true);
            responseVo.setData(data);
        }catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }

    @PostMapping("/userMgmt/getRoleProg")
    public ResponseVo getRoleProg(@RequestBody String roleId) {
        ResponseVo responseVo = new ResponseVo();
        try{
            List<String> data = userMgmtService.getRoleProg(roleId);
            responseVo.setStatus(true);
            responseVo.setData(data);
        }catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }

    @PostMapping("/userMgmt/saveUser")
    public ResponseVo saveUser(@RequestBody SaveUserVo saveUserVo) {
        ResponseVo responseVo = new ResponseVo();
        try {
            userMgmtService.saveUser(saveUserVo);
            responseVo.setStatus(true);
        } catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }

    @PostMapping("/userMgmt/getUserInfoById")
    public ResponseVo saveUser(@RequestBody String userId) {
        ResponseVo responseVo = new ResponseVo();
        try {
            SaveUserVo data = userMgmtService.getUserInfoById(userId);
            responseVo.setStatus(true);
            responseVo.setData(data);
        } catch (Exception ex) {
            responseVo.setStatus(false);
            logger.error(ex.getMessage(), ex);
        }
        return responseVo;
    }
}

package com.travel.service.Impl;

import com.travel.mapper.VwUserAuthProgMapper;
import com.travel.mapper.VwUserAuthRolesMapper;
import com.travel.model.VwUserAuthProg;
import com.travel.model.VwUserAuthProgExample;
import com.travel.model.VwUserAuthRoles;
import com.travel.model.VwUserAuthRolesExample;
import com.travel.service.LoginService;

import com.travel.vo.ProgAuthVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private VwUserAuthRolesMapper vwUserAuthRolesMapper;
    @Autowired
    private VwUserAuthProgMapper vwUserAuthProgMapper;

    @Override
    public String checkUserInfo(VwUserAuthRoles obj) throws Exception {
        VwUserAuthRolesExample example = new VwUserAuthRolesExample();
        VwUserAuthRolesExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(obj.getUserId());


        if(vwUserAuthRolesMapper.countByExample(example) == 0) {
            return "unregistered";
        }

        criteria.andUserPasswordEqualTo(obj.getUserPassword());

        if(vwUserAuthRolesMapper.countByExample(example) == 0) {
            return "pwd_error";
        }

        return "ok";
    }

    @Override
    public VwUserAuthRoles getUserAuthByUserId(String userId) throws Exception {
        VwUserAuthRolesExample example = new VwUserAuthRolesExample();
        VwUserAuthRolesExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);

        List<VwUserAuthRoles> list = vwUserAuthRolesMapper.selectByExample(example);
        if(list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ProgAuthVo> getUserProgAuth(String userId,String parentId) {
        List<ProgAuthVo> lstProgAuth = new ArrayList<>();

        VwUserAuthProgExample example = new VwUserAuthProgExample();
        VwUserAuthProgExample.Criteria criteria = example.createCriteria();
        criteria.andParentProgIdEqualTo(parentId);
        criteria.andUserIdEqualTo(userId);
        example.setOrderByClause(" prog_sort, prog_id ");
        List<VwUserAuthProg> lstUserAuthProg = vwUserAuthProgMapper.selectByExample(example);

        for (VwUserAuthProg vwUserAuthProg : lstUserAuthProg) {
            ProgAuthVo vo = new ProgAuthVo();
            BeanUtils.copyProperties(vwUserAuthProg,vo);
            vo.setChildren(this.getUserProgAuth(userId,vwUserAuthProg.getProgId()));

            lstProgAuth.add(vo);
        }
        return lstProgAuth;
    }
}

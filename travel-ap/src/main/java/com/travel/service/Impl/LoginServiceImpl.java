package com.travel.service.Impl;

import com.travel.mapper.VwUserAuthRolesMapper;
import com.travel.model.VwUserAuthRoles;
import com.travel.model.VwUserAuthRolesExample;
import com.travel.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private VwUserAuthRolesMapper vwUserAuthRolesMapper;

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
        return list.get(0);
    }
}

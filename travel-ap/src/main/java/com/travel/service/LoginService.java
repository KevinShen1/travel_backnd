package com.travel.service;

import com.travel.model.VwUserAuthRoles;
import com.travel.vo.ProgAuthVo;

import java.util.List;


public interface LoginService {

    public String checkUserInfo(VwUserAuthRoles obj) throws Exception;

    public VwUserAuthRoles getUserAuthByUserId(String userId) throws Exception;

    public List<ProgAuthVo> getUserProgAuth(String userId,String parentId);
}

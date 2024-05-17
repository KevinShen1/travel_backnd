package com.travel.service;

import com.travel.model.VwUserAuthRoles;



public interface LoginService {

    public String checkUserInfo(VwUserAuthRoles obj) throws Exception;

    public VwUserAuthRoles getUserAuthByUserId(String userId) throws Exception;
}

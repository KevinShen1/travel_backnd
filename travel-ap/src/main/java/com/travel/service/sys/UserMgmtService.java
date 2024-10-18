package com.travel.service.sys;

import com.travel.model.TbSysRole;
import com.travel.model.TbSysUser;
import com.travel.model.VwUserAuthRoles;
import com.travel.vo.ProgTreeVo;
import com.travel.vo.SaveUserVo;

import java.util.List;

public interface UserMgmtService {

    public List<VwUserAuthRoles> queryUserList();

    public List<TbSysRole> queryRoleList();

    public List<ProgTreeVo> queryAllProgList(String parentProgId);

    public List<String> getRoleProg(String roleId);

    public void saveUser(SaveUserVo saveUserVo);

    public SaveUserVo getUserInfoById(String userId);
}

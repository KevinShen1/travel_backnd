package com.travel.model;

public class TbSysRoleProgSetKey {
    private String roleId;

    private String progId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getProgId() {
        return progId;
    }

    public void setProgId(String progId) {
        this.progId = progId == null ? null : progId.trim();
    }
}
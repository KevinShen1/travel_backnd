package com.travel.vo;

import com.travel.model.TbSysUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveUserVo {
    String userId;
    TbSysUser userInfo;
    String roleId;
}

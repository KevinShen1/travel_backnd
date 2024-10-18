package com.travel.mapper;

import com.travel.model.VwUserAuthRoles;
import com.travel.model.VwUserAuthRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VwUserAuthRolesMapper {
    int countByExample(VwUserAuthRolesExample example);

    int deleteByExample(VwUserAuthRolesExample example);

    int insert(VwUserAuthRoles record);

    int insertSelective(VwUserAuthRoles record);

    List<VwUserAuthRoles> selectByExample(VwUserAuthRolesExample example);

    int updateByExampleSelective(@Param("record") VwUserAuthRoles record, @Param("example") VwUserAuthRolesExample example);

    int updateByExample(@Param("record") VwUserAuthRoles record, @Param("example") VwUserAuthRolesExample example);
}
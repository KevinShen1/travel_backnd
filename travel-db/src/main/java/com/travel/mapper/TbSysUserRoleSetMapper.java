package com.travel.mapper;

import com.travel.model.TbSysUserRoleSet;
import com.travel.model.TbSysUserRoleSetExample;
import com.travel.model.TbSysUserRoleSetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysUserRoleSetMapper {
    int countByExample(TbSysUserRoleSetExample example);

    int deleteByExample(TbSysUserRoleSetExample example);

    int deleteByPrimaryKey(TbSysUserRoleSetKey key);

    int insert(TbSysUserRoleSet record);

    int insertSelective(TbSysUserRoleSet record);

    List<TbSysUserRoleSet> selectByExample(TbSysUserRoleSetExample example);

    TbSysUserRoleSet selectByPrimaryKey(TbSysUserRoleSetKey key);

    int updateByExampleSelective(@Param("record") TbSysUserRoleSet record, @Param("example") TbSysUserRoleSetExample example);

    int updateByExample(@Param("record") TbSysUserRoleSet record, @Param("example") TbSysUserRoleSetExample example);

    int updateByPrimaryKeySelective(TbSysUserRoleSet record);

    int updateByPrimaryKey(TbSysUserRoleSet record);
}
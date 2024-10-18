package com.travel.mapper;

import com.travel.model.TbSysRoleProgSet;
import com.travel.model.TbSysRoleProgSetExample;
import com.travel.model.TbSysRoleProgSetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysRoleProgSetMapper {
    int countByExample(TbSysRoleProgSetExample example);

    int deleteByExample(TbSysRoleProgSetExample example);

    int deleteByPrimaryKey(TbSysRoleProgSetKey key);

    int insert(TbSysRoleProgSet record);

    int insertSelective(TbSysRoleProgSet record);

    List<TbSysRoleProgSet> selectByExample(TbSysRoleProgSetExample example);

    TbSysRoleProgSet selectByPrimaryKey(TbSysRoleProgSetKey key);

    int updateByExampleSelective(@Param("record") TbSysRoleProgSet record, @Param("example") TbSysRoleProgSetExample example);

    int updateByExample(@Param("record") TbSysRoleProgSet record, @Param("example") TbSysRoleProgSetExample example);

    int updateByPrimaryKeySelective(TbSysRoleProgSet record);

    int updateByPrimaryKey(TbSysRoleProgSet record);
}
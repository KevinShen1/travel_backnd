package com.travel.mapper;

import com.travel.model.TbSysProg;
import com.travel.model.TbSysProgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysProgMapper {
    int countByExample(TbSysProgExample example);

    int deleteByExample(TbSysProgExample example);

    int deleteByPrimaryKey(String progId);

    int insert(TbSysProg record);

    int insertSelective(TbSysProg record);

    List<TbSysProg> selectByExample(TbSysProgExample example);

    TbSysProg selectByPrimaryKey(String progId);

    int updateByExampleSelective(@Param("record") TbSysProg record, @Param("example") TbSysProgExample example);

    int updateByExample(@Param("record") TbSysProg record, @Param("example") TbSysProgExample example);

    int updateByPrimaryKeySelective(TbSysProg record);

    int updateByPrimaryKey(TbSysProg record);
}
package com.travel.mapper;

import com.travel.model.VwUserAuthProg;
import com.travel.model.VwUserAuthProgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VwUserAuthProgMapper {
    int countByExample(VwUserAuthProgExample example);

    int deleteByExample(VwUserAuthProgExample example);

    int insert(VwUserAuthProg record);

    int insertSelective(VwUserAuthProg record);

    List<VwUserAuthProg> selectByExample(VwUserAuthProgExample example);

    int updateByExampleSelective(@Param("record") VwUserAuthProg record, @Param("example") VwUserAuthProgExample example);

    int updateByExample(@Param("record") VwUserAuthProg record, @Param("example") VwUserAuthProgExample example);
}
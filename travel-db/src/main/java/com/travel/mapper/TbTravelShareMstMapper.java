package com.travel.mapper;

import com.travel.model.TbTravelShareMst;
import com.travel.model.TbTravelShareMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTravelShareMstMapper {
    int countByExample(TbTravelShareMstExample example);

    int deleteByExample(TbTravelShareMstExample example);

    int deleteByPrimaryKey(Integer travelId);

    int insert(TbTravelShareMst record);

    int insertSelective(TbTravelShareMst record);

    List<TbTravelShareMst> selectByExample(TbTravelShareMstExample example);

    TbTravelShareMst selectByPrimaryKey(Integer travelId);

    int updateByExampleSelective(@Param("record") TbTravelShareMst record, @Param("example") TbTravelShareMstExample example);

    int updateByExample(@Param("record") TbTravelShareMst record, @Param("example") TbTravelShareMstExample example);

    int updateByPrimaryKeySelective(TbTravelShareMst record);

    int updateByPrimaryKey(TbTravelShareMst record);
}
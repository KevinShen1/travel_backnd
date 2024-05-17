package com.travel.service.Impl;

import com.travel.mapper.TbTravelShareMstMapper;
import com.travel.model.TbTravelShareMst;
import com.travel.model.TbTravelShareMstExample;
import com.travel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TbTravelShareMstMapper tbTravelShareMstMapper;

    @Override
    public List<TbTravelShareMst> getTravelShareMst(String userId){
        TbTravelShareMstExample example = new TbTravelShareMstExample();
        TbTravelShareMstExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIsActiveEqualTo(true);
        example.setOrderByClause("last_update_datetime");
        return tbTravelShareMstMapper.selectByExample(example);
    }
}

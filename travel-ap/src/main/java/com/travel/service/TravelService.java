package com.travel.service;

import com.travel.model.TbTravelShareMst;

import java.util.List;

public interface TravelService {

    public List<TbTravelShareMst> getTravelShareMst(String userId) throws Exception;
}

package com.travel.controller;

import com.travel.service.TravelService;
import com.travel.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @PostMapping("/getTravelShareMst")
    public ResponseVo getTravelShareMst(@RequestBody String userId) {
        ResponseVo responseVo = new ResponseVo();
        try {
            responseVo.setStatus(true);
            responseVo.setData(travelService.getTravelShareMst(userId));
        }catch (Exception e) {
            e.getMessage();
        }
        return responseVo;
    }
}

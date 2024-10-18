package com.travel.vo;

import com.travel.model.VwUserAuthProg;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProgAuthVo extends VwUserAuthProg {

    //遞迴物件功能
    private List<ProgAuthVo> children;
}

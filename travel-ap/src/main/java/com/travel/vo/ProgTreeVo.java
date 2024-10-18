package com.travel.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProgTreeVo {
    String title;
    String key;
    String icon;
    Boolean isLeaf;
    Boolean checked;
    Boolean selected;
    Boolean selectable;
    Boolean disabled;
    Boolean disableCheckbox;
    Boolean expanded;
    List<ProgTreeVo> children;
}

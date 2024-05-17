package com.travel.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseVo {

	private boolean status;
	private String message;
	private Object data;
}

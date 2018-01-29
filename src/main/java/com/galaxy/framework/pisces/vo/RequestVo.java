package com.galaxy.framework.pisces.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class RequestVo implements Serializable {

    private Map<String, Object> params = new HashMap<>();
}

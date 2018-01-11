package com.galaxy.framework.pisces.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class TreeVo implements Serializable {

    private String id;

    private String text;

    private String parent;

    private String type;

    private Map<String, Object> state = new HashMap<>();
}

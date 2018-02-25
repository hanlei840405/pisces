package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ResourceVo extends BaseVo implements Serializable {

    private static final long serialVersionUID = -5388446520597202753L;

    private String code;

    private String name;

    private String resourceCode;

    private String resourceName;
}

package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.EntityVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class ResourceVo extends EntityVo implements Serializable {

    private static final long serialVersionUID = -5388446520597202753L;

    private String code;

    private String name;

    private ResourceVo resourceVo;
}

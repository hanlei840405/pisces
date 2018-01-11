package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.Vo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class ResourceVo extends Vo implements Serializable {

    private static final long serialVersionUID = -5388446520597202753L;

    private Long id;

    private String code;

    private String name;

    private ResourceVo resourceVo;

    private String status;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private int version = 0;
}

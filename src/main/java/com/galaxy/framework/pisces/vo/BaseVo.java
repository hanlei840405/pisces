package com.galaxy.framework.pisces.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BaseVo implements Serializable {
    private static final long serialVersionUID = 5749319116884568790L;
    private String status;
    private String creator;
    private Date created;
    private String modifier;
    private Date modified;
    private int version = 0;
}

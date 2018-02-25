package com.galaxy.framework.pisces.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3693794039597112865L;

    private Long id;

    private String status;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private Integer version;
}

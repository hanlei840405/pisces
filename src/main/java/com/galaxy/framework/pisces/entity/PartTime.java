package com.galaxy.framework.pisces.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class PartTime extends BaseEntity implements Serializable {

    private String positionCode;

    private String userCode;
}

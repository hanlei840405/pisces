package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.Vo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
public class PositionVo extends Vo implements Serializable {
    private static final long serialVersionUID = 573452572222497588L;

    private Long id;

    private String code;

    private String name;

    // 上级岗位
    private PositionVo positionVo;

    // 岗位所在部门
    private DepartmentVo departmentVo;

    // 是否是部门负责人关键岗位
    private boolean manager;

    private String status;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private int version = 0;
}
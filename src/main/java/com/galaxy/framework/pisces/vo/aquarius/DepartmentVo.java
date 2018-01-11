package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.Vo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
public class DepartmentVo extends Vo implements Serializable {
    private static final long serialVersionUID = -141438274154966805L;

    private Long id;

    private String code;

    private String name;

    private String fullPath;

    private String fullName;

    // 上级部门
    private DepartmentVo departmentVo;

    // 本部门下的岗位信息
    private Collection<PositionVo> positionVos;

    private String status;

    private String creator;

    private Date created;

    private String modifier;

    private Date modified;

    private int version = 0;
}
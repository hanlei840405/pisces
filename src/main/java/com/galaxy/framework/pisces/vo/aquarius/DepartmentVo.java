package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;

@Setter
@Getter
public class DepartmentVo extends BaseVo implements Serializable {
    private static final long serialVersionUID = -141438274154966805L;

    private String code;

    private String name;

    private String fullPath;

    private String fullName;

    private boolean parent;

    // 上级部门
    private String departmentCode;

    // 上级部门
    private String departmentName;

    private String locationCode;

    private String locationName;
}

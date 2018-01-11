package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.EntityVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
public class UserVo extends EntityVo implements Serializable {
    private static final long serialVersionUID = -6290826770540342881L;

    private String code;

    private String name;

    private String email;

    private String mobile;

    private String gender;

    private String birthday;

    // 入职日期
    private String entryDay;

    // 转正日期
    private String regularDay;

    // 离职日期
    private String leaveDay;

    private String headImg;

    private DepartmentVo departmentVo;

    private PositionVo positionVo;

    // 兼职岗位
    private Collection<PositionVo> positionVos;
}

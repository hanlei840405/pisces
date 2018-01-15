package com.galaxy.framework.pisces.vo.aquarius;

import com.galaxy.framework.pisces.vo.EntityVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanlei6 on 2018/1/15.
 */
@Setter
@Getter
public class LocationVo extends EntityVo implements Serializable {

    private String code;

    private String name;

    private List<DepartmentVo> departmentVos = new ArrayList<>();
}

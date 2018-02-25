package com.galaxy.framework.pisces.vo.capricorn;

import com.galaxy.framework.pisces.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jesse.han
 */
@Setter
@Getter
public class BuildingVo extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;

    private String name;

    private String locationCode;

    private String locationName;

    private String address;

    private BigDecimal acreage;

    private BigDecimal height;

    private String remark;
}
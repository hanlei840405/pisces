package com.galaxy.framework.pisces.vo.capricorn;

import com.galaxy.framework.pisces.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
@Setter
@Getter
public class HouseVo extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;

    private String name;

    private BigDecimal acreage;

    private BigDecimal height;

    private BigDecimal publicArea;

    private BigDecimal rent;

    private String areaCode;

    private String areaName;

    private String floorCode;

    private String floorName;

    private String buildingCode;

    private String buildingName;

    private String locationCode;

    private String locationName;

    private String remark;

    /**
     * 管家
     */
    private String userCode;

    private String username;
}
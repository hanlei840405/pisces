package com.galaxy.framework.pisces.vo.capricorn;

import com.galaxy.framework.pisces.vo.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 
 */
@Setter
@Getter
public class OwnerVo extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;

    private String name;

    private String idNumber;

    private String mobile;

    private String gender;

    private String birthday;

    private String headImg;
}
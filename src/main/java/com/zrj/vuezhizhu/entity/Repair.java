package com.zrj.vuezhizhu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Repair {
    /**
     * 报修id
     */
    private Integer repairid;
    /**
     * 学校
     */
    private String schoolName;
    /**
     * 寝室楼
     */
    private String building;
    /**
     * 寝室号
     */
    private String room;
    /**
     * 报修学生
     */
    private String stuName;
    /**
     * 联系方式
     */
    private String phoneNum;
    /**
     * 报修详情
     */
    private String repairDetail;
    /**
     * 报修时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date repairTime;
    /**
     * 报修状态
     */
    private boolean repairStatus;
}

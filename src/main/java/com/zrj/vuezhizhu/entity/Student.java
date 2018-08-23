package com.zrj.vuezhizhu.entity;

import lombok.Data;

@Data
public class Student {
    /**
     * 微信id
     */
    private String openid;
    /**
     * 身份证号
     */
    private String stuid;
    /**
     * 姓名
     */
    private String stuName;
    /**
     * 联系方式
     */
    private String phoneNum;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 学校
     */
    private String schoolName;
    /**
     * 学院
     */
    private String college;
    /**
     * 专业
     */
    private String major;
    /**
     * 寝室楼
     */
    private String building;
    /**
     * 寝室
     */
    private String room;
}


package com.zrj.vuezhizhu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Problem {
    /**
     * 问题反馈id
     */
    private Integer problemid;
    /**
     * 反馈学生姓名
     */
    private String stuName;
    /**
     * 学校
     */
    private String schoolName;
    /**
     * 寝室楼
     */
    private String building;
    /**
     * 寝室
     */
    private String room;
    /**
     * 联系方式
     */
    private String phoneNum;
    /**
     * 问题反馈详情
     */
    private String problemDetail;
    /**
     * 问题反馈时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date problemTime;
    /**
     * 问题反馈状态
     */
    private boolean problemStatus;
}

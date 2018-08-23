package com.zrj.vuezhizhu.entity;

import lombok.Data;

@Data
public class ProblemParam {
    /**
     * 分页的第几页
     */
    private Integer pageNo;
    /**
     * 分页的每页数目
     */
    private Integer pageSize;
    /**
     * 分页具体从第几条开始
     */
    private Integer pageStart;
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
     * 问题时间
     */
    private String problemTime;
    /**
     * 问题状态
     */
    private boolean problemStatus;
}

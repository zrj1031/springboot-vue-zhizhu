package com.zrj.vuezhizhu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Room {
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
     * 寝室性别
     */
    private Integer gender;
    /**
     * 寝室人数
     */
    private Integer number;
    /**
     * 寝室租赁年限
     */
    private Integer years;
    /**
     * 寝室租金
     */
    private Integer rent;
    /**
     * 寝室押金
     */
    private Integer deposit;
    /**
     * 总金额
     */
    private Integer totai_fee;
    /**
     * 寝室付款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date payTime;
    /**
     * 微信支付单号
     */
    private String transaction_id;
    /**
     * 商户单号
     */
    private String out_trade_no;
    /**
     * 押金是否退回
     */
    private Integer isReturn;
    /**
     * 付款人微信id
     */
    private String openid;
}

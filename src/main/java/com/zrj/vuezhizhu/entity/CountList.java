package com.zrj.vuezhizhu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CountList<T> {
    /**
     * 总条目数
     */
    private Integer count;
    /**
     * 前端实际展现的条目
     */
    private List<T> list;
}

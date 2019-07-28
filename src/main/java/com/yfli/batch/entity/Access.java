package com.yfli.batch.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
/**
 * Created by yfli on 2019/7/28 10:50.
 */
@Entity
@Table
@Getter
@Setter
@ToString
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; //编号
    private String username;//用户名称
    private String shopName;//
    private String categoryName;//
    private String brandName;//
    private String shopId;
    private String omit;
    private String updateTime;
    private boolean deleteStatus;
    private String createTime;
    private String description;
}

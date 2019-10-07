package com.xuehaizi.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 类目
 */
@Entity
@DynamicUpdate
@Data
@Proxy(lazy = false)
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1757832423912187192L;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    //    category_idint(11) NOT NULL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
//    category_namevarchar(64) NOT NULL类目名字
    private String categoryName;
//    category_typeint(11) NOT NULL类目编号
    private Integer categoryType;

    /**创建时间*/
    private Date createTime;

    /**修改时间*/
    private Date updateTime;

}

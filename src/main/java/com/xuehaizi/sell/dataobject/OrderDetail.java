package com.xuehaizi.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@Proxy(lazy = false)
public class OrderDetail {

//    FieldTypeComment
//    detail_idvarchar(32) NOT NULL
    @Id
    private String detailId;
//    order_idvarchar(32) NOT NULL
    private String orderId;
//    product_idvarchar(32) NOT NULL
    private String productId;
//    product_namevarchar(64) NOT NULL商品名称
    private String productName;
//    product_pricedecimal(8,2) NOT NULL商品价格
    private BigDecimal productPrice;
//    product_quantityint(11) NOT NULL商品数量
    private Integer productQuantity;
//    product_iconvarchar(512) NULL商品小图
    private String productIcon;
}

package com.xuehaizi.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
@Proxy(lazy = false)
public class SellerInfo {


//    FieldTypeComment
//    seller_idvarchar(32) NOT NULL
    @Id
    private String sellerId;
//    usernamevarchar(32) NOT NULL
    private String username;
//    passwordvarchar(32) NOT NULL
    private String password;
//    openidvarchar(64) NOT NULL微信openid
    private String openid;
////    create_timetimestamp NOT NULL创建时间
//    private Date createTime;
////    update_timetimestamp NOT NULL修改时间
//    private Date updateTime;
}

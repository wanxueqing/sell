package com.xuehaizi.sell.dataobject;

import com.xuehaizi.sell.enums.OrderStatusEnum;
import com.xuehaizi.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@Proxy(lazy = false)
public class OrderMaster {



//    FieldTypeComment
//    order_idvarchar(32) NOT NULL
    @Id
    private String orderId;
//    buyer_namevarchar(32) NOT NULL买家名字
    private String buyerName;
//    buyer_phonevarchar(32) NOT NULL买家电话
    private String buyerPhone;
//    buyer_addressvarchar(128) NOT NULL买家地址
    private String buyerAddress;
//    buyer_openidvarchar(64) NOT NULL买家微信openid
    private String buyerOpenid;
//    order_amountdecimal(8,2) NOT NULL订单总金额
    private BigDecimal orderAmount;
//    order_statustinyint(3) NOT NULL订单状态，默认0新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
//    pay_statustinyint(3) NOT NULL支付状态，默认0未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
//    create_timetimestamp NOT NULL创建时间
    private Date createTime;
//    update_timetimestamp NOT NULL修改时间
    private Date updateTime;

}

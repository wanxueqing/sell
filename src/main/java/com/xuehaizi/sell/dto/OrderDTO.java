package com.xuehaizi.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xuehaizi.sell.dataobject.OrderDetail;
import com.xuehaizi.sell.enums.OrderStatusEnum;
import com.xuehaizi.sell.enums.PayStatusEnum;
import com.xuehaizi.sell.utils.EnumUtil;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

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
    private Integer orderStatus;
    //    pay_statustinyint(3) NOT NULL支付状态，默认0未支付
    private Integer payStatus;
    //    create_timetimestamp NOT NULL创建时间
//    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    //    update_timetimestamp NOT NULL修改时间
//    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }


}

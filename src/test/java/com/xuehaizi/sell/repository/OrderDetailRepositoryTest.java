package com.xuehaizi.sell.repository;

import com.xuehaizi.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    OrderDetailRepository repository;

    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("1234567890");
        orderDetail.setOrderId("11111111112");
        orderDetail.setProductId("1111111114");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductName("猪脚饭");
        orderDetail.setProductPrice(new BigDecimal(9.9));
        orderDetail.setProductQuantity(3);
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId(){

        List<OrderDetail> orderDetailList = repository.findByOrderId("11111111112");
        Assert.assertNotEquals(0,orderDetailList);

    }

}
package com.xuehaizi.sell.service.impl;

import com.xuehaizi.sell.dto.OrderDTO;
import com.xuehaizi.sell.service.OrderService;
import com.xuehaizi.sell.service.PushMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageService pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() {
        OrderDTO result = orderService.findOne("1569855784678204936");
        pushMessageService.orderStatus(result);
    }
}
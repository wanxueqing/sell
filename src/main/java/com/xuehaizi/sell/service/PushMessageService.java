package com.xuehaizi.sell.service;

import com.xuehaizi.sell.dto.OrderDTO;

public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}

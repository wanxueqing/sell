package com.xuehaizi.sell.service.impl;

import com.xuehaizi.sell.dataobject.SellerInfo;
import com.xuehaizi.sell.repository.SellerInfoRepository;
import com.xuehaizi.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

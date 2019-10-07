package com.xuehaizi.sell.repository;

import com.xuehaizi.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
//        List<ProductCategory> productCategories = repository.findAll();
//        for (ProductCategory p:productCategories) {
//            System.out.println(p);
//        }
        Optional<ProductCategory> byId = repository.findById(1);
        System.out.println(byId.toString()+"88888888888888888888888888");

    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(10);
//        Assert.assertNotNull(result);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());

    }

}
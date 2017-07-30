package com.boke.house.mapper;

import com.boke.house.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void save() {
        Product product = new Product();
        product.setName("金光小区");
        product.setCity("上海");
        product.setAddress("上南路");
        product.setPrice(30000.00);
        product.setDiscount(2000.00);
        product.setReleaseTime(new Date());
        product.setType(1);
        product.setSummary("在这里");
        product.setDescription("test description");
        product.setArea(3021923.00);
        product.setDelivery(new Date());
        product.setOpening(new Date());
        product.setDeveloper("xxx开发商");
        product.setGreenRate(23.00);
        product.setVolumeRate(10.00);
        productMapper.save(product);
        System.out.println(product);
    }

    @Test
    public void listAll() {
        List<Product> p = productMapper.listAll();
        for (Product product : p) {
            System.out.println(product);
        }
    }

    @Test
    public void delete() {
        productMapper.delete(2);
    }

    @Test
    public void getById() {
        Product pr = productMapper.getProductById(1);
        System.out.println(pr);
    }
}

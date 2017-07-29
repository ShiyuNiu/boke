package com.boke.house.mapper;

import com.boke.house.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerMapperTest {
    @Autowired
    private CustomerMapper customerMapper;
    @Test
    public void save() {
        Customer customer = new Customer();
        customer.setMessage("test message");
        customer.setName("test name");
        customer.setPhone("11010101293");
        customer.setVisitTime(new Date());
        customerMapper.save(customer);
        System.out.println(customer);
    }

    @Test
    public void listAll() {
        List<Customer> customers = customerMapper.listAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

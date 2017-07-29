package com.boke.house.mapper;

import com.boke.house.entity.Customer;
import com.boke.house.mapper.handler.MyDateTypeHandler;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CustomerMapper {
    String INSERT_COLUMNS = "name, phone, message, visit_time";
    String BASE_COLUMNS = "id, name, phone, message, visit_time";
    @Insert({"INSERT INTO customer (", INSERT_COLUMNS, ") VALUES (#{name}, #{phone}, #{message}, #{visitTime})"})
    @Options(useGeneratedKeys = true)
    int save(Customer customer);
    @Select({"SELECT", BASE_COLUMNS, "FROM customer"})
    @Results(value = {
            @Result(column = "visit_time", property = "visitTime", typeHandler = MyDateTypeHandler.class)
    })
    List<Customer> listAll();
    @Delete({"DELETE customer WHERE id=#{id}"})
    int delete(int id);
}

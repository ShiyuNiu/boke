package com.boke.house.mapper;

import com.boke.house.entity.Product;
import com.boke.house.mapper.handler.MyDateTypeHandler;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductMapper {
    String BASE_COLUMNS = "id, name, city, address, price, discount, release_time, type, summary, description, area, " +
            "delivery, opening, developer, green_rate, volume_rate";
    String INSERT_COLUMNS = "name, city, address, price, discount, release_time, type, summary, description, area, " +
            "delivery, opening, developer, green_rate, volume_rate";
    String INSERT_COLUMNS_FILED = "#{name}, #{city}, #{address}, #{price}, #{discount}, #{releaseTime}, #{type}, " +
            "#{summary}, #{description}, #{area}, #{delivery}, #{opening}, #{developer}, #{greenRate}, #{volumeRate}";

    @Insert({"INSERT INTO product (", INSERT_COLUMNS, ") VALUES (", INSERT_COLUMNS_FILED, ")"})
    @Options(useGeneratedKeys = true)
    int save(Product product);

    @Delete({"DELETE FROM product WHERE id=#{id}"})
    int delete(int id);

    @Select({"SELECT", BASE_COLUMNS, "FROM product"})
    @Results(value = {
            @Result(column = "release_time", property = "releaseTime", typeHandler = MyDateTypeHandler.class),
            @Result(column = "delivery", property = "delivery", typeHandler = MyDateTypeHandler.class),
            @Result(column = "opening", property = "opening", typeHandler = MyDateTypeHandler.class)
    })
    List<Product> listAll();

    @Select({"SELECT", BASE_COLUMNS, "FROM product WHERE id=#{productId}"})
    @Results(value = {
            @Result(column = "release_time", property = "releaseTime", typeHandler = MyDateTypeHandler.class),
            @Result(column = "delivery", property = "delivery", typeHandler = MyDateTypeHandler.class),
            @Result(column = "opening", property = "opening", typeHandler = MyDateTypeHandler.class)
    })
    Product getProductById(int productId);
}

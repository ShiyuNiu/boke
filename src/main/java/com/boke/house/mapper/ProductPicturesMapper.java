package com.boke.house.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ProductPicturesMapper {
    String INSERT_COLUMNS = "product_id, picture_id";

    @Insert({"INSERT INTO product_pictures (", INSERT_COLUMNS , ") VALUES (#{product_id}, #{picture_id})"})
    int save(int productId, int picturesId);
}

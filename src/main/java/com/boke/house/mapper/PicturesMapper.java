package com.boke.house.mapper;

import com.boke.house.entity.Pictures;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PicturesMapper {
    String INSERT_COLUMNS = "path, type";
    String BASE_COLUMNS  = "id, path, type";

    @Insert({"INSERT INTO pictures (", INSERT_COLUMNS, ") VALUES", "(#{path}, #{type})"})
    @Options(useGeneratedKeys = true)
    int save(Pictures pictures);

    @Delete("DELETE FROM pictures WHERE id=#{id}")
    int delete(int id);

    @Select({"SELECT", BASE_COLUMNS, "FROM pictures"})
    List<Pictures> listAll();
    @Select({"SELECT", BASE_COLUMNS, "FROM pictures WHERE id IN (SELECT id FROM product_pictures WHERE product_id=#{id})"})
    List<Pictures> listByProductId(int id);
}

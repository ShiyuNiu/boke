package com.boke.house.mapper;

import com.boke.house.entity.Pictures;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PicturesMapperTest {
    @Autowired
    private PicturesMapper picturesMapper;
    @Test
    public void save() {
        Pictures p = new Pictures();
        p.setPath("tests path");
        p.setType(2);
        picturesMapper.save(p);
        System.out.println(p);
    }

    @Test
    public void listAll() {
        List<Pictures> l = picturesMapper.listAll();
        for (Pictures pictures : l) {
            System.out.println(pictures);
        }
    }

    @Test
    public void listByProductId() {
        List<Pictures> p = picturesMapper.listByProductId(1);
        for (Pictures pictures : p) {
            System.out.println(pictures);
        }
    }
}

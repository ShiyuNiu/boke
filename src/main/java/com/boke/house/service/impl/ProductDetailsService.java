package com.boke.house.service.impl;

import com.boke.house.entity.Pictures;
import com.boke.house.entity.Product;
import com.boke.house.mapper.PicturesMapper;
import com.boke.house.mapper.ProductMapper;
import com.boke.house.service.IProductDetailsService;
import com.boke.house.utils.EntityTransform;
import com.boke.house.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsService implements IProductDetailsService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private PicturesMapper picturesMapper;

    @Override
    public ProductVO getProductVOByProductId(int productId) {
        Product product = productMapper.getProductById(productId);
        List<Pictures> picturesList = picturesMapper.listByProductId(productId);
        ProductVO productVO = EntityTransform.productToVO(product);
        productVO.setPictures(picturesList);
        return productVO;
    }
}

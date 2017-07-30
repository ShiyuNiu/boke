package com.boke.house.service;

import com.boke.house.vo.ProductVO;

import java.util.List;

public interface IProductDetailsService {
    ProductVO getProductVOByProductId(int productId);
    List<ProductVO> listAllProducts();
}

package com.boke.house.service;

import com.boke.house.vo.ProductVO;

public interface IProductDetailsService {
    ProductVO getProductVOByProductId(int productId);
}

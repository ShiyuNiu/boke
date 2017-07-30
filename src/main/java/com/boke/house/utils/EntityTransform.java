package com.boke.house.utils;

import com.boke.house.entity.Product;
import com.boke.house.vo.ProductVO;

import static com.boke.house.vo.ProductVO.*;

public class EntityTransform {
    public static ProductVO productToVO(Product product) {
        ProductVO productVO = new ProductVO();
        productVO.setId(product.getId());
        productVO.setName(product.getName());
        productVO.setCity(product.getCity());
        productVO.setAddress(product.getAddress());
        productVO.setPrice(product.getPrice());
        productVO.setDiscount(product.getDiscount());
        productVO.setReleaseTime(product.getReleaseTime());
        productVO.setType(product.getType());
        switch (product.getType()) {
            case TYPE_BLANK:
                productVO.setTypeStr(TYPE_BLANK_STR);
                break;
            case TYPE_SIMPLE:
                productVO.setTypeStr(TYPE_SIMPLE_STR);
                break;
            case TYPE_COMPLEX:
                productVO.setTypeStr(TYPE_COMPLEX_STR);
                break;
            default:
                productVO.setTypeStr(TYPE_OTHER_STR);
                break;
        }
        productVO.setSummary(product.getSummary());
        productVO.setDescription(product.getDescription());
        productVO.setArea(product.getArea());
        productVO.setDelivery(product.getDelivery());
        productVO.setOpening(product.getOpening());
        productVO.setDeveloper(product.getDeveloper());
        productVO.setGreenRate(product.getGreenRate());
        productVO.setVolumeRate(product.getVolumeRate());
        return productVO;
    }
}

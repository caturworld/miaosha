package com.example.miaosha.service;

import com.example.miaosha.entity.SeckillProduct;
import com.example.miaosha.inter.SeckillProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangqinyu
 * @since 2023/09/20
 */
public class SeckillProductService {
    private final SeckillProductRepository seckillProductRepository;

    @Autowired
    public SeckillProductService(SeckillProductRepository seckillProductRepository) {
        this.seckillProductRepository = seckillProductRepository;
    }
    public void saveSeckillProduct(SeckillProduct product) {
        seckillProductRepository.save(product);
    }

    public SeckillProduct getSeckillProduct(String id) {
        return seckillProductRepository.findById(id).orElse(null);
    }

    // 其他操作方法...   
}

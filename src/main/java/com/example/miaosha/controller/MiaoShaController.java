package com.example.miaosha.controller;

import com.example.miaosha.entity.SeckillProduct;
import com.example.miaosha.service.SeckillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangqinyu
 * @since 2023/09/20
 */
@RestController
@RequestMapping("/miaosha")
public class MiaoShaController {
    
    private SeckillProductService seckillProductService;
    
    @PostMapping("/add")
    public void add() {
        SeckillProduct seckillProduct=new SeckillProduct();
        seckillProduct.setStock(1);
        seckillProductService.saveSeckillProduct(seckillProduct);
    }
    @GetMapping("/get")
    public SeckillProduct get() {
        SeckillProduct product = seckillProductService.getSeckillProduct("1");
        return product;
    }
}

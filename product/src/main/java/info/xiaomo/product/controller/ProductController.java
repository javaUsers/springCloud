package info.xiaomo.product.controller;

import info.xiaomo.product.constant.StatusEnum;
import info.xiaomo.product.entity.ProductInfo;
import info.xiaomo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/6/23 13:45
 * desc  :
 * Copyright(©) 2018 by xiaomo.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/findAll")
    public List<ProductInfo> findAll() {
        return service.findProductsByStatus(StatusEnum.SALE.getStatus());
    }

}

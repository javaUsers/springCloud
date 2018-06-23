package info.xiaomo.product.service.impl;

import info.xiaomo.product.dao.ProductRepository;
import info.xiaomo.product.entity.Product;
import info.xiaomo.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Product> findProductsByStatus(int status) {
        return repository.findProductByStatus(status);
    }
}

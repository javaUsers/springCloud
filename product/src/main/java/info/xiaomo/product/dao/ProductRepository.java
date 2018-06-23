package info.xiaomo.product.dao;

import info.xiaomo.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
 * Date  : 2018/6/23 12:05
 * desc  :
 * Copyright(©) 2018 by xiaomo.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    /**
     * 根据状态查找商品
     *
     * @param status 状态
     * @return 商品列表
     */
    List<Product> findProductByStatus(int status);
}

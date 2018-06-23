package info.xiaomo.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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
 * Date  : 2018/6/23 11:43
 * desc  :
 * Copyright(©) 2018 by xiaomo.
 */
@Data
@Table(name = "product")
@Entity
public class Product {

    @Id
    private int productId;

    private String productName;

    private float price;

    private int stock;

    private String desc;

    private String icon;

    private int category;

    private int status;

    private Date createTime;

    private Date updateTime;

}

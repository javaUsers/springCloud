package info.xiamo.eurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/4 下午5:57
 * desc  :
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello: " + name;
    }
}

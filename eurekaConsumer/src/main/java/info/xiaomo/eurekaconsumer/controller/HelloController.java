package info.xiaomo.eurekaconsumer.controller;

import info.xiaomo.eurekaconsumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/4 下午5:36
 * desc  :
 */
@RestController
public class HelloController {

    private final HelloRemote helloRemote;

    @Autowired
    public HelloController(HelloRemote helloRemote) {
        this.helloRemote = helloRemote;
    }


    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return helloRemote.hello(name);
    }
}

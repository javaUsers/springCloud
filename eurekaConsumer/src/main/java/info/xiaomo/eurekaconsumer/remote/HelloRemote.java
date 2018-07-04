package info.xiaomo.eurekaconsumer.remote;

import info.xiaomo.eurekaconsumer.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/4 下午5:38
 * desc  :
 */

@FeignClient(value = "eurekaProducer",fallback = HelloHystrix.class)
@Component
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);

}

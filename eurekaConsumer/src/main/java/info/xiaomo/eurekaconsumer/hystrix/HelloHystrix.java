package info.xiaomo.eurekaconsumer.hystrix;

import info.xiaomo.eurekaconsumer.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/4 下午6:08
 * desc  :
 */

@Component
public class HelloHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" + name + "send failed ";
    }
}

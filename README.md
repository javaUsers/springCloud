# 踩坑大全
1. eureka client启动到一半就断了,加个spring-boot-starter-web依赖就好了
2. eureka server在启动时就报错,因为他在尝试自己注册自己，关掉注册就好了
3. 在eureka server端,yml中添加enable-self-preservation=false，仅限开发环境下配置
4. eureka server注册的实例可点击, 可配置instance.hostname来指定
5. eureka高可用，部署多台server时在配置中互相注册(除开自己的其他server都要注册)，client端注册所有的server
6. eureka作为基础服务，不需要docker化
7. 
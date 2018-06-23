# 踩坑大全
1. eureka client启动到一半就断了,加个spring-boot-starter-web依赖就好了
2. eureka server在启动时就报错,因为他在尝试自己注册自己，关掉注册就好了
3. 在eureka server端,yml中添加enable-self-preservation=false，仅限开发环境下配置
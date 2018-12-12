*# Spring cloud demo(单例模式)

> 本demo使用gradle构建工具构建<br>
1、分别对Eureka Client/Eureka Server/Feign 进行构建<br>
2、启动Eureka Server构建后的jar包，即为Eureka服务server方<br>
3、编辑Eureka Client application.yml更改server.port来创建2个client<br>
4、启动feign，实现了ribbon负载均衡和hystrix<br>
5、eureka服务端web界面地址：http://localhost:8761/eureka/ <br>
6、客户端调用接口：http://localhost:8765/getUrl，会分别响应eureka client刚刚自己配置的两个port

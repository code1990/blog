package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置类 代替xml配置
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}

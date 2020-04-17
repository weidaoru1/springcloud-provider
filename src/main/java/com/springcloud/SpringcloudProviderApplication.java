package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  // 开启 Eureka 客户端，让服务提供者可以连接注册中心
public class SpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderApplication.class, args);
    }

}

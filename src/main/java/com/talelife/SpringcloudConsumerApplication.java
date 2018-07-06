package com.talelife;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.talelife.myproject.mapper")
@EnableSwagger2
@EnableFeignClients(basePackages = { "com.talelife.myproject.feign"})
public class SpringcloudConsumerApplication {

	public static void main(String[] args) throws Exception {
       SpringApplication.run(SpringcloudConsumerApplication.class, args);
  }


}

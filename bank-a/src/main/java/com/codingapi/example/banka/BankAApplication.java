package com.codingapi.example.banka;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @param:
 * @return: 
 * @date: 2019/10/21 13:53
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableDistributedTransaction
@MapperScan(basePackages = "com.codingapi.example.banka.mapper")
public class BankAApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAApplication.class,args);
    }
}

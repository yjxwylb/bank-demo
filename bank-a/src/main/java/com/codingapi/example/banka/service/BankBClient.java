package com.codingapi.example.banka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @param:
 * @return:
 * @date: 2019/10/21 13:53
 */
@FeignClient(value = "bank-b")
public interface BankBClient {

    @GetMapping("/add-money")
    String addMoney(@RequestParam("money") int money, @RequestParam("user") String user);
}

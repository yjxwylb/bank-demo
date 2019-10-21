package com.codingapi.example.bankb.controller;

import com.codingapi.example.bankb.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @param:
 * @return:
 * @date: 2019/10/21 13:53
 */
@RestController
public class BankController {


    @Autowired
    private BankService bankService;

    @GetMapping("/add-money")
    public String addMoney(@RequestParam("money") int money, @RequestParam("user") String user){
        return bankService.addMoney(money,user);
    }
}

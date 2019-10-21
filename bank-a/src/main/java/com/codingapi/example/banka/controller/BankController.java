package com.codingapi.example.banka.controller;

import com.codingapi.example.banka.service.BankService;
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

    @GetMapping("/start")
    public String start(@RequestParam("money") int money){
        return bankService.start(money);
    }
}

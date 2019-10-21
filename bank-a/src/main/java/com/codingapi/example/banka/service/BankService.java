package com.codingapi.example.banka.service;

import com.codingapi.example.banka.entity.TbankEntity;
import com.codingapi.example.banka.mapper.TbankMapper;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @param:
 * @return:
 * @date: 2019/10/21 13:53
 */
@Service
public class BankService {

    @Autowired
    private TbankMapper tbankMapper;

    @Autowired
    private BankBClient bankBClient;

    @LcnTransaction
    @Transactional
    public String start(int money) {

        String user = "小明";
        String state = bankBClient.addMoney(money,user);
        if("success".equals(state)){
            TbankEntity tbankEntity = new TbankEntity();
            tbankEntity.setMoney(money);
            tbankEntity.setUser(user);
            Long update = tbankMapper.update(tbankEntity);
            //int res = accountDao.update(account);
            throw new RuntimeException("error runtime.");
            //return update>0?"success":"error";
        }
        return "rpc error";
    }

}

package com.codingapi.example.bankb.service;

import com.codingapi.example.bankb.entity.TbankEntity;
import com.codingapi.example.bankb.mapper.TbankMapper;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @param:
 * @return:
 * @date: 2019/10/21 13:53
 */
@Component
public class BankService {

    @Autowired
    private TbankMapper tbankMapper;

    @TxcTransaction
    @Transactional
    public String addMoney(int money, String user) {
        TbankEntity tbankEntity = new TbankEntity();
        tbankEntity.setMoney(money);
        tbankEntity.setUser(user);
        Long update = tbankMapper.update(tbankEntity);
        return update>0?"success":"error";
    }
}

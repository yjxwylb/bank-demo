package com.codingapi.example.bankb.mapper;


import com.codingapi.example.bankb.entity.TbankEntity;

import java.util.List;

public interface TbankMapper {
    List<TbankEntity> query(TbankEntity tbank);

    Long save(TbankEntity tbank);

    Long update(TbankEntity tbank);

}

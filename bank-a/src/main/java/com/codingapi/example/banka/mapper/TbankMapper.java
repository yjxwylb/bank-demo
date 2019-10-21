package com.codingapi.example.banka.mapper;


import com.codingapi.example.banka.entity.TbankEntity;

import java.util.List;

public interface TbankMapper{
	public List<TbankEntity> query(TbankEntity tbank);
	
	public Long save(TbankEntity tbank);

	public Long update(TbankEntity tbank);

}

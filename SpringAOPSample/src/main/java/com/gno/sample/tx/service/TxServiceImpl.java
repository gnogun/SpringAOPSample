package com.gno.sample.tx.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gno.sample.dto.TxTest;
import com.gno.sample.repository.TxTestRepository;

public class TxServiceImpl implements TxService {

	@Autowired
	private TxTestRepository repository;
	
	@Override
	public int addTx(TxTest test) {
		// TODO Auto-generated method stub
		try {
			if (test.getName().equals("wrong")) {
				throw new Exception();
			}else{
				
				repository.save(test);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public int addNoTx(TxTest test) {
		// TODO Auto-generated method stub
		repository.save(test);
		return 0;
		
	}

}

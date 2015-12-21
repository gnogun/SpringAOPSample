package com.gno.sample.tx.service;

import org.springframework.transaction.annotation.Transactional;

import com.gno.sample.dto.TxTest;


public class TxServiceImplAnno implements TxService {

	@Transactional
	@Override
	public int addTx(TxTest test) {
		// TODO Auto-generated method stub
		try {
			if (test.getName().equals("wrong")) {
				throw new Exception();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}

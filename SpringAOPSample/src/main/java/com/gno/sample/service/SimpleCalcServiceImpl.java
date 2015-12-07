package com.gno.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gno.sample.dao.CalcDAO;
import com.gno.sample.dto.TxTest;

public class SimpleCalcServiceImpl implements SimpleCalcService {

	@Autowired
	public CalcDAO calcDao;

	@Override
	public int add(int val1, int val2) {
		// TODO Auto-generated method stub
		return calcDao.add(val1, val2);
	}

	@Override
	public int addTx() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int addTx(TxTest test) {
		// TODO Auto-generated method stub
		return 0;
	}

}

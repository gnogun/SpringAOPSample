package com.gno.sample.tx.service;

import com.gno.sample.dto.TxTest;

public interface TxService {
	public int addTx(TxTest test);	
	public int addNoTx(TxTest test);
}

package com.gno.sample.aop.tx;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gno.sample.dto.TxTest;
import com.gno.sample.service.SimpleCalcService;
import com.gno.sample.tx.service.TxService;

@ContextConfiguration(locations={"file:src/main/resources/transaction-context.xml"})
/*
@ContextConfiguration(locations={"file:src/main/resources/transaction-context_xml.xml"})
*/
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionTest {
	
	@Autowired
	private TxService txService;
	
	@Test
	public void test(){		
		int returnVal = txService.addTx(new TxTest("asd", "asd"));
		
		assertThat(returnVal, is(0));
		
	}
}

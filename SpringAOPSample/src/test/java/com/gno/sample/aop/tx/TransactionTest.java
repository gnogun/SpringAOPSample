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

@ContextConfiguration(locations={"file:src/main/resources/transaction-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionTest {
	@Autowired
	public SimpleCalcService simpleCalcService;
	
	@Test
	public void test(){
		
		int returnVal = simpleCalcService.addTx(new TxTest("asd", "asd"));
		
		
		assertThat(returnVal, is(0));
		
	}
}

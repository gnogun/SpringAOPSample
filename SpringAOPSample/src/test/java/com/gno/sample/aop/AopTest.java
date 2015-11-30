package com.gno.sample.aop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import com.gno.sample.service.SimpleCalcService;

//@ContextConfiguration(locations={"file:src/main/resources/aop-context.xml"})
@ContextConfiguration(locations={"file:src/main/resources/aop-context_xml.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {
	
	@Autowired
	public SimpleCalcService simpleCalcService;
	
	@Test
	public void test(){
		
		int returnVal = simpleCalcService.add(1, 1);
		
		
		assertThat(returnVal, is(2));
		
	}
}

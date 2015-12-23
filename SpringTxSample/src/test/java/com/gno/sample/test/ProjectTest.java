package com.gno.sample.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import com.gno.sample.dto.Person;
import com.gno.sample.repository.PersonRepository;
import com.gno.sample.service.TxService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/tx_context_xml.xml")
public class ProjectTest {
	
	@Autowired
	private PersonRepository repo;
	
	@Autowired
	private TxService service;
	
	@Test
	public void projectMake(){
		Person person = new Person("gno1", "gnogun@naver.com1", "gno1");
		Person person2 = new Person("gno2", "gnogun@naver.com1", "gno1");
		
		repo.save(person);
		repo.save(person2);
		repo.save(person);
		
//		service.addTx(person);
	}
}

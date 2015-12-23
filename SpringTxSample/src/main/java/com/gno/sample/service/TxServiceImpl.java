package com.gno.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gno.sample.dto.Person;
import com.gno.sample.repository.PersonRepository;


public class TxServiceImpl implements TxService {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public int addTx(Person test) {
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
	public int addNoTx(Person test) {
		// TODO Auto-generated method stub
		repository.save(test);
		return 0;
		
	}

}

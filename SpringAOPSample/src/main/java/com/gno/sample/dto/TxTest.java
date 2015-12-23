package com.gno.sample.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TxTest {
	
	private int idx;
	
	private String name;
	private String description;
	
	public TxTest() {
		// TODO Auto-generated constructor stub
	}
	
	public TxTest(String name, String description) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}
	
	
	
}
>>>>>>> branch 'master' of https://github.com/gnogun/SpringAOPSample.git

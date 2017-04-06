package com.ruokakomero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ruoka {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String amount;
	private String info;
	
	public Ruoka() {
		
	}
	
	public Ruoka(long id, String title, String amount, String info) {
		super();
		
		this.id = id;
		this.title = title;
		this.amount = amount;
		this.info = info;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	

}

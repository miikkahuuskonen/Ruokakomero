package com.ruokakomero.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ruoka {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String amount;
	private String info;
	private String date;
	
	public Ruoka() {		
	}
	
	public Ruoka(String title, String amount, String info, String date) {
		this.title = title;
		this.amount = amount;
		this.info = info;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Ruoka [id=" + id + ", title=" + title + ", amount=" + amount + ", info=" + info + ", date=" + date + "]";
	}

	
	
	
	

}

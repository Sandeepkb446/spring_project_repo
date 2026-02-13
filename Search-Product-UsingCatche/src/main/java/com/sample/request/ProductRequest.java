package com.sample.request;

import java.io.Serializable;

public class ProductRequest  implements Serializable{

	private String pname;
	private String price;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}



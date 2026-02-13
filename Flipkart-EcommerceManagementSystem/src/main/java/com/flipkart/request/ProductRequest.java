package com.flipkart.request;


public class ProductRequest {

	
	private Integer pid;
	private String pname;
	private Double price;
	private String category;
	private String description;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProductEntity [pid=" + pid + ", pname=" + pname + ", price=" + price + ", category=" + category
				+ ", description=" + description + "]";
	}
	public ProductRequest() {
		super();
	}
	
	
	
	
}

package com.generateInvoice.entity;

public class InvoiceEntity {

	private Integer customerId;
	private String item;
	private Double price;
	private String qty;
	private Double totalAmount;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "InvoiceEntity [customerId=" + customerId + ", item=" + item + ", price=" + price + ", qty=" + qty
				+ ", totalAmount=" + totalAmount + "]";
	}
	
	
}

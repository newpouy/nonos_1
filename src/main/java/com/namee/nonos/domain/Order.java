package com.namee.nonos.domain;

public class Order {
	private int orderId;
	private String companyName;
	private String orderPerson;
	private String factory;
//	private String[] attachedFilePath;
	private int purchasePrice;
	private int supplyPrice;
	private String item;
	private int amount;
	private String memo;
	private String deleteYN;
	private String user;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOrderPerson() {
		return orderPerson;
	}
	public void setOrderPerson(String orderPerson) {
		this.orderPerson = orderPerson;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
//	public String[] getAttachedFilePath() {
//		return attachedFilePath;
//	}
//	public void setAttachedFilePath(String[] attachedFilePath) {
//		this.attachedFilePath = attachedFilePath;
//	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getSupplyPrice() {
		return supplyPrice;
	}
	public void setSupplyPrice(int supplyPrice) {
		this.supplyPrice = supplyPrice;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getDeleteYN() {
		return deleteYN;
	}
	public void setDeleteYN(String deleteYN) {
		this.deleteYN = deleteYN;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	
}

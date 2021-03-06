package com.daonguyen.model;

public class Product {
	private int code;
	private String name;
	private int amount;
	private float price;
	
	public Product() {
	}
	
	public Product(int code, String name, int amount, float price) {
		this.code = code;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	
	public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

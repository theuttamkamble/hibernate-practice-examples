package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_info")
public class Product {
	@Id
	@Column(name = "product_id")
	private int id;
	private String product;
	@Column(name = "in_stock")
	private boolean inStock;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String product, boolean inStock) {
		super();
		this.id = id;
		this.product = product;
		this.inStock = inStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + ", inStock=" + inStock + "]";
	}

}

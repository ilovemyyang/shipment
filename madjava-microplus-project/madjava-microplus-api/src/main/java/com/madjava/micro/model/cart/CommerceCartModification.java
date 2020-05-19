package com.madjava.micro.model.cart;

import java.io.Serializable;

import com.madjava.micro.model.product.Products;

public class CommerceCartModification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4855491994102792606L;
	//购物车商品总数
	private int quantity;
	
	private String statusCode;
	//购物车选中商品的数量
	private int selectQuantity;
	
	private Cart cart;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	

	public int getSelectQuantity() {
		return selectQuantity;
	}

	public void setSelectQuantity(int selectQuantity) {
		this.selectQuantity = selectQuantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	

}

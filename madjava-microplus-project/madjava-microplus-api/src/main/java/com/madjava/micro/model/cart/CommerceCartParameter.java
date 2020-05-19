package com.madjava.micro.model.cart;

import java.io.Serializable;

import com.madjava.micro.model.product.Products;

public class CommerceCartParameter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2901120334343184541L;

	
	private Cart cart;
	
	private String productCode;
	
	private int quantity;
	
	/**
	 * 是否跳过购物车计算
	 */
	private boolean skip;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}
	
	
}

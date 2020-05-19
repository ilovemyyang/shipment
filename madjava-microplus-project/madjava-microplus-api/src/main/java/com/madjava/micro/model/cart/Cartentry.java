package com.madjava.micro.model.cart;


import com.madjava.micro.model.order.AbstractOrderEntryModel;

/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author 埃森哲-
 */
public class Cartentry extends AbstractOrderEntryModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    /**
     * 购物车编码
     */
    private String cartCode;


	public String getCartCode() {
		return cartCode;
	}


	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}


    
}

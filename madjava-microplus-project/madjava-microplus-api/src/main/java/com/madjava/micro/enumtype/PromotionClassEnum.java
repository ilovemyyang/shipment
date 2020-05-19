package com.madjava.micro.enumtype;

/**
 *   used for the property:subType of PromotionBaseInfo
 *   
 * @author fei.a.xu
 *
 */
public enum PromotionClassEnum {
	
	
	PRODUCT_FIXEDPRICE_PROMOTION("productFixedPricePromotionService", "单品促销"),//商品促销一定要放订单促销前端，因为订单促销的金额依赖与商品金额
	ORDER_THRESHOLD_PROMOTION("orderThresholdPromotionService", "订单满额减");
	
	private String code;
	
	private String name;

	private PromotionClassEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

}

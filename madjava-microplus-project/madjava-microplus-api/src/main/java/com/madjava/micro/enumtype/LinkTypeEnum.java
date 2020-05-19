package com.madjava.micro.enumtype;

public enum LinkTypeEnum implements AbstractEnum {

	LinkTypeUrl("LinkTypeUrl","LinkTypeUrl"),
	
	LinkTypeProduct("LinkTypeProduct","LinkTypeProduct"),
	
	LinkTypeCategory("LinkTypeCategory","LinkTypeCategory"),
	
	LinkTypeProductSearch("LinkTypeProductSearch","LinkTypeProductSearch"),
	
	LinkTypeCategorySearch("LinkTypeCategorySearch","LinkTypeCategorySearch"),
	
	LinkTypeServerUrl("LinkTypeServerUrl","LinkTypeServerUrl"),
	
	LinkQRScan("LinkQRScan","LinkQRScan"),
	
	LinkTypeBrand("LinkTypeBrand","LinkTypeBrand"),
	
	LinkTypePage("LinkTypePage","LinkTypePage"),
	
	GroupBuyingLink("GroupBuyingLink","GroupBuyingLink"),
	
	GroupBuyingProductLink("GroupBuyingProductLink","GroupBuyingProductLink"),
	
	LinkTypeLocal("LinkTypeLocal","LinkTypeLocal"),
	
	LinkTypePersonalCenter("LinkTypePersonalCenter","LinkTypePersonalCenter"),
	
	LinkTypeSpecificCategory("LinkTypeSpecificCategory","LinkTypeSpecificCategory"),
	
	ToCollege("ToCollege","ToCollege"),
	
	Page("Page","Page"),
	
	LinkTypeCouponPage("LinkTypeCouponPage","LinkTypeCouponPage"),
	
	LinkTypeInnerPage("LinkTypeInnerPage","LinkTypeInnerPage");
	
	private String name;
	
	private String code;
	
	LinkTypeEnum(String code, String name) {
		this.name = name;
		this.code = code;
	}
	
	public String getName() {
		return this.name;
	}

	public String getCode() {
		return code;
	}
}

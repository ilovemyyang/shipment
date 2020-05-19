package com.madjava.micro.enumtype;

public enum DisplayThemeEnum implements AbstractEnum {

	Carousel("Carousel", "Carousel"),
	
	TextLink("TextLink","TextLink"),
	
	TextLinkAndPicture("TextLinkAndPicture","TextLinkAndPicture"),
	
	FourPicturesAndLink("FourPicturesAndLink","FourPicturesAndLink"),
	
	FivePicturesAndLink("FivePicturesAndLink","FivePicturesAndLink"),
	
	OnePictureAndLink("OnePictureAndLink","OnePictureAndLink"),
	
	TwoPictureAndLink("TwoPictureAndLink","TwoPictureAndLink"),
	
	BannerThreePictureAndLink("BannerThreePictureAndLink","BannerThreePictureAndLink"),
	
	SecondsKill("SecondsKill","SecondsKill"),
	
	HotSaleProducts("HotSaleProducts","HotSaleProducts"),
	
	GeneralWithOneProduct("GeneralWithOneProduct","GeneralWithOneProduct"),
	
	GeneralWithThreeProduct("GeneralWithThreeProduct","GeneralWithThreeProduct"),
	
	BrandThreePictureAndLink("BrandThreePictureAndLink","BrandThreePictureAndLink"),
	
	RecommendCategory("RecommendCategory","RecommendCategory"),
	
	TextLinkAndTwoPicture("TextLinkAndTwoPicture","TextLinkAndTwoPicture"),
	
	SlideProducts("SlideProducts","SlideProducts"),
	
	OnePictureAndTwoProducts("OnePictureAndTwoProducts","OnePictureAndTwoProducts"),
	
	IVPicturesAndLink("IVPicturesAndLink","IVPicturesAndLink"),
	
	TwoFlatPictureAndLink("TwoFlatPictureAndLink","TwoFlatPictureAndLink"),
	
	OneHighPictureAndLink("OneHighPictureAndLink","OneHighPictureAndLink"),
	
	CategoriesAndProducts("CategoriesAndProducts","CategoriesAndProducts"),
	
	SlideProductsII("SlideProductsII","SlideProductsII"),
	
	FourFlatPicturesAndLink("FourFlatPicturesAndLink","FourFlatPicturesAndLink"),
	
	ProductListAndLink("ProductListAndLink","ProductListAndLink"),
	
	FivePicturesNoTitleAndLink("FivePicturesNoTitleAndLink","FivePicturesNoTitleAndLink"),
	
	Partitions("Partitions","Partitions"),
	
	HighCarousel("HighCarousel","HighCarousel"),
	
	DetailOfProduct("DetailOfProduct","DetailOfProduct"),
	
	Interval("Interval","Interval"),
	
	OnePictureAndProducts("OnePictureAndProducts","OnePictureAndProducts"),
	
	OneFlatPictureAndLink("OneFlatPictureAndLink","OneFlatPictureAndLink"),
	
	HotSaleProductsOfThree("HotSaleProductsOfThree","HotSaleProductsOfThree"),
	
	ThreeBannerSixProducts("ThreeBannerSixProducts","ThreeBannerSixProducts"),
	
	TabAndProducts("TabAndProducts","TabAndProducts"),
	
	ThreeFlatPictureAndLink("ThreeFlatPictureAndLink","ThreeFlatPictureAndLink");
	
	private String name;
	
	private String code;
	
	DisplayThemeEnum(String code, String name) {
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

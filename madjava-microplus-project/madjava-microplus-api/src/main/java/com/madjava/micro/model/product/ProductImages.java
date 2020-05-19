package com.madjava.micro.model.product;

import java.io.Serializable; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  商品图片
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author madjava-
 */
public class ProductImages implements Serializable {

    private static final long serialVersionUID = -2019355021299872547L;

    /**
     */
    private String pk;

    /**
     */
    private String productCode;

    /**
     */
    private String imageMd5;

    /**
     */
    private String imagePath;

    /**
     */
    private String imageUrl;

    /**
     */
    private String imagePostfix;

    /**
     */
    private String imageType;

    /**
     */
    private Integer rankNo;

    /**
     * <pre>
     * </pre>
     * 
     * @return the pk
     */
    public String getPk() {

        return pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param pk the pk to set
     */
    public void setPk(String pk) {

        this.pk = pk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the productCode
     */
    public String getProductCode() {

        return productCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {

        this.productCode = productCode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the imageMd5
     */
    public String getImageMd5() {

        return imageMd5;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param imageMd5 the imageMd5 to set
     */
    public void setImageMd5(String imageMd5) {

        this.imageMd5 = imageMd5;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the imagePath
     */
    public String getImagePath() {

        return imagePath;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {

        this.imagePath = imagePath;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the imageUrl
     */
    public String getImageUrl() {

        return imageUrl;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {

        this.imageUrl = imageUrl;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the imagePostfix
     */
    public String getImagePostfix() {

        return imagePostfix;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param imagePostfix the imagePostfix to set
     */
    public void setImagePostfix(String imagePostfix) {

        this.imagePostfix = imagePostfix;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the imageType
     */
    public String getImageType() {

        return imageType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param imageType the imageType to set
     */
    public void setImageType(String imageType) {

        this.imageType = imageType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the rankNo
     */
    public Integer getRankNo() {

        return rankNo;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param rankNo the rankNo to set
     */
    public void setRankNo(Integer rankNo) {

        this.rankNo = rankNo;
    }
}

package com.madjava.micro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsMessageDto {
	
	private String USER_ID;
	private String SMS_SERVER;
	private String PHONENUMBER;
	private String CONTENT;
	/**
	 * @return the uSER_ID
	 */
	@JsonProperty("USER_ID")
	public String getUSER_ID() {
		return USER_ID;
	}
	/**
	 * @param uSER_ID the uSER_ID to set
	 */
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	/**
	 * @return the sMS_SERVER
	 */
	@JsonProperty("SMS_SERVER")
	public String getSMS_SERVER() {
		return SMS_SERVER;
	}
	/**
	 * @param sMS_SERVER the sMS_SERVER to set
	 */
	public void setSMS_SERVER(String sMS_SERVER) {
		SMS_SERVER = sMS_SERVER;
	}
	/**
	 * @return the pHONENUMBER
	 */
	@JsonProperty("PHONENUMBER")
	public String getPHONENUMBER() {
		return PHONENUMBER;
	}
	/**
	 * @param pHONENUMBER the pHONENUMBER to set
	 */
	public void setPHONENUMBER(String pHONENUMBER) {
		PHONENUMBER = pHONENUMBER;
	}
	/**
	 * @return the cONTENT
	 */
	@JsonProperty("CONTENT")
	public String getCONTENT() {
		return CONTENT;
	}
	/**
	 * @param cONTENT the cONTENT to set
	 */
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SmsMessageDto [USER_ID=" + USER_ID + ", SMS_SERVER="
				+ SMS_SERVER + ", PHONENUMBER=" + PHONENUMBER + ", CONTENT="
				+ CONTENT + "]";
	}


}

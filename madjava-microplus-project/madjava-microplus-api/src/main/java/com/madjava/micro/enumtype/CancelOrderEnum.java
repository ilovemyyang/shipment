package com.madjava.micro.enumtype;

public enum CancelOrderEnum {
	WAITTING_CANCEL(1,"取消申请中"),
	CANCEL_SUCCESS(2, "取消成功"),
	CANCEL_FAIL(3,"取消失败"),
	MANUAL_INTERVENTION(9,"人工干预");
	private Integer status;
	
	private String message;

	private CancelOrderEnum(Integer status, String message) {
		this.status = status;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}	


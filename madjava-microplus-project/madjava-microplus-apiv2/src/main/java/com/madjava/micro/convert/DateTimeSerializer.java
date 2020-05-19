package com.madjava.micro.convert;

public class DateTimeSerializer extends AbstractDateFormatSerializer {

	@Override
	protected String getDateFormat() {
		return "yyyy-MM-dd HH:mm:ss";
	}
}

package com.madjava.micro.convert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTimeDeserialize extends AbstractDateFormatDeserialize {

	private static final String DATE_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";
	
	@Override
	public DateFormat getDateFormat() {
		return new SimpleDateFormat(DATE_FORMAT_STRING);
	}

	
}

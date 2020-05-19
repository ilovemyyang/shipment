package com.madjava.micro.convert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateDeserialize extends AbstractDateFormatDeserialize {

	private static final String DATE_FORMAT_STRING = "yyyy-MM-dd";

	@Override
	public DateFormat getDateFormat() {
		return new SimpleDateFormat(DATE_FORMAT_STRING);
	}

}

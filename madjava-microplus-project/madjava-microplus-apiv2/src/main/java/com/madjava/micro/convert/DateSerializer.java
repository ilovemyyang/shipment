package com.madjava.micro.convert;

public class DateSerializer extends AbstractDateFormatSerializer {

	@Override
	protected String getDateFormat() {
		return "yyyy-MM-dd";
	}
}

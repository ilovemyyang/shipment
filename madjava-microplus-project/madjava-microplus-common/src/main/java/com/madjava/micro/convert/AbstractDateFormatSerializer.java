package com.madjava.micro.convert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public abstract class AbstractDateFormatSerializer extends JsonSerializer<Date> {

	protected abstract String getDateFormat();

	@Override
	public void serialize(Date value, JsonGenerator jsonGenerator,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		SimpleDateFormat sdf = new SimpleDateFormat(getDateFormat());
		jsonGenerator.writeString(sdf.format(value));
	}
}

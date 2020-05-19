package com.madjava.micro.convert;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public abstract class AbstractDateFormatDeserialize extends JsonDeserializer<Date> {

    public abstract DateFormat getDateFormat();

    @Override
    public Date deserialize(JsonParser paramJsonParser,
            DeserializationContext paramDeserializationContext)
            throws IOException, JsonProcessingException {
        String str = paramJsonParser.getText().trim();
        try {
            return getDateFormat().parse(str);
        } catch (ParseException e) {

        }
        return paramDeserializationContext.parseDate(str);
    }
}
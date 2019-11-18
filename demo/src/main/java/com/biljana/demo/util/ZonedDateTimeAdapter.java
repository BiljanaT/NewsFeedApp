package com.biljana.demo.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

	private final DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("E, d MMM yyyy HH:mm:ss Z");

	@Override
	public ZonedDateTime unmarshal(String xml) throws Exception {
		return ZonedDateTime.parse(xml, dateTimeFormat);
	}

	@Override
	public String marshal(ZonedDateTime object) throws Exception {
		return dateTimeFormat.format(object);
	}

}

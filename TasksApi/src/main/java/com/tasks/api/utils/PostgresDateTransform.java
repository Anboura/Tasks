package com.tasks.api.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;


public class PostgresDateTransform {
	private static Pattern POSTGRES_DATE_PATTERN = Pattern.compile("^[12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
		      
	public static String toFrontDate(final LocalDate localDate) {
		final String result = localDate != null ?  localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : null;
		return result;
	}
	public static LocalDate toBackDate(final String inputDate) {
		final LocalDate result = isValidStringPostgesDate(inputDate) ? LocalDate.parse(inputDate) : null;
		return result;
	}
	public static boolean isValidStringPostgesDate(final String date) {
		return !StringUtils.isEmpty(date) && POSTGRES_DATE_PATTERN.matcher(date).matches();
	}
}

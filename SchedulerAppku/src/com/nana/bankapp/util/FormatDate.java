package com.nana.bankapp.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class FormatDate {

	public String formatDate(Date date) {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}

}

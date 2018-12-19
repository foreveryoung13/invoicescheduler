package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import com.nana.bankapp.model.Customer;

public class CustomerEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String uuid) {

		int val = 0;
		Customer c;

		if (uuid.equals("14664be8-e268-4d96-8202-1f5f26ee59bd")) {
			val = 1;
		} else if (uuid.equals("43953db1-e028-4b75-b6b5-9b3574ba71e4")) {
			val = 2;
		} else if (uuid.equals("66c4c37d-aff6-4c27-8cae-80fb3bb37d3c")) {
			val = 3;
		}

		switch (val) {
		case 1:
			c = new Customer("14664be8-e268-4d96-8202-1f5f26ee59bd", "Bank Danamon");
			break;
		case 2:
			c = new Customer("43953db1-e028-4b75-b6b5-9b3574ba71e4", "Astra Honda Motor");
			break;
		case 3:
			c = new Customer("66c4c37d-aff6-4c27-8cae-80fb3bb37d3c", "Zurich");
			break;
		default:
			c = null;
		}
		this.setValue(c);
	}

}

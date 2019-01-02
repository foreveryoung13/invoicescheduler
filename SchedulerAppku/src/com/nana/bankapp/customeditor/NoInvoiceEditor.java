package com.nana.bankapp.customeditor;

import java.beans.PropertyEditorSupport;

public class NoInvoiceEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String noInvoice) throws IllegalArgumentException {
		if (noInvoice.contains("18/INV/")) {
			setValue(noInvoice);
		} else {
			noInvoice = "18/INV/" + noInvoice;
			setValue(noInvoice);
		}
	}

}

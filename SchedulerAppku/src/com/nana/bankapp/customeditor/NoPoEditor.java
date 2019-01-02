package com.nana.bankapp.customeditor;

import java.beans.PropertyEditorSupport;

public class NoPoEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String noPo) throws IllegalArgumentException {
		if (noPo.length() > 3) {
			if (noPo.contains("PO/")) {
				setValue(noPo);
			} else {
				noPo = "PO/" + noPo;
				setValue(noPo);
			}
		}
	}

}

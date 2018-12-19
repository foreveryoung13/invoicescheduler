package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import com.nana.bankapp.model.Marketing;

public class MarketingEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String uuid) {

		int val = 0;
		Marketing c;

		if (uuid.equals("047f7c23-8065-4357-8152-650d925becbd")) {
			val = 1;
		} else if (uuid.equals("380182b8-3445-44a3-90c7-d3f538a801e6")) {
			val = 2;
		} else if (uuid.equals("80512ca1-e651-420b-ad51-e09f64004073")) {
			val = 3;
		} else if (uuid.equals("d9fe0ea9-dd71-4c87-9d3f-8f0185b69567")) {
			val = 4;
		}

		switch (val) {
		case 1:
			c = new Marketing("047f7c23-8065-4357-8152-650d925becbd", "Nana");
			break;
		case 2:
			c = new Marketing("380182b8-3445-44a3-90c7-d3f538a801e6", "Mario");
			break;
		case 3:
			c = new Marketing("80512ca1-e651-420b-ad51-e09f64004073", "Sandi");
			break;
		case 4:
			c = new Marketing("d9fe0ea9-dd71-4c87-9d3f-8f0185b69567", "Febe");
			break;
		default:
			c = null;
		}
		this.setValue(c);
	}

}

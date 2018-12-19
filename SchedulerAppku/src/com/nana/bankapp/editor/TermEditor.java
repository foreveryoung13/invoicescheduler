package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import com.nana.bankapp.model.Term;

public class TermEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String uuid) {

		int val = 0;
		Term t;

		if (uuid.equals("9d2b12d7-39eb-4676-94af-96bfb59a676f")) {
			val = 1;
		} else if (uuid.equals("bccd74c7-c52f-47db-86d3-5c4fdef3235d")) {
			val = 2;
		} else if (uuid.equals("efb694e1-6e70-43a8-8177-744f635dc699")) {
			val = 3;
		}

		switch (val) {
		case 1:
			t = new Term("047f7c23-8065-4357-8152-650d925becbd", "10");
			break;
		case 2:
			t = new Term("380182b8-3445-44a3-90c7-d3f538a801e6", "11");
			break;
		case 3:
			t = new Term("80512ca1-e651-420b-ad51-e09f64004073", "12");
			break;
		default:
			t = null;
		}
		this.setValue(t);
	}

}

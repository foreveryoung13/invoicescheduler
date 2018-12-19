package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import com.nana.bankapp.model.Project;

public class RemarkEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String uuid) {

		int val = 0;
		Project p;

		if (uuid.equals("172ff788-010a-47dd-86b8-441fac421ef0")) {
			val = 1;
		} else if (uuid.equals("89af1931-d870-4e37-9df6-f62e994b42e3")) {
			val = 2;
		} else if (uuid.equals("ce4d55e8-aae3-4fa8-9161-f8fe41cb4387")) {
			val = 3;
		}

		switch (val) {
		case 1:
			p = new Project("172ff788-010a-47dd-86b8-441fac421ef0", "Terms 3");
			break;
		case 2:
			p = new Project("89af1931-d870-4e37-9df6-f62e994b42e3", "Terms 1");
			break;
		case 3:
			p = new Project("ce4d55e8-aae3-4fa8-9161-f8fe41cb4387", "Terms 2");
			break;
		default:
			p = null;
		}
		this.setValue(p);
	}

}

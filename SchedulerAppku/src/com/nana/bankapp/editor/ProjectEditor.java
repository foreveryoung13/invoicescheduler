package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import com.nana.bankapp.model.Project;

public class ProjectEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String uuid) {

		int val = 0;
		Project p;

		if (uuid.equals("a62a0de9-2f62-497a-93d0-f5b8bd61baa9")) {
			val = 1;
		} else if (uuid.equals("d6cb01c0-f59c-4584-8688-0dd231093670")) {
			val = 2;
		} else if (uuid.equals("f55d7994-0c53-41fd-867f-a8b4a8440946")) {
			val = 3;
		}

		switch (val) {
		case 1:
			p = new Project("a62a0de9-2f62-497a-93d0-f5b8bd61baa9", "Avantrade BTN");
			break;
		case 2:
			p = new Project("d6cb01c0-f59c-4584-8688-0dd231093670", "Avantrade Danamon");
			break;
		case 3:
			p = new Project("f55d7994-0c53-41fd-867f-a8b4a8440946", "Avantrade BCA");
			break;
		default:
			p = null;
		}
		this.setValue(p);
	}

}

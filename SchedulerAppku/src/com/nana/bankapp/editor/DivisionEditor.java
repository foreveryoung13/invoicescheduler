package com.nana.bankapp.editor;

import java.beans.PropertyEditorSupport;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nana.bankapp.model.Division;
import com.nana.bankapp.services.DivisionService;

@Component
public class DivisionEditor extends PropertyEditorSupport {
	
	@Autowired
	DivisionService ds;

	@Override
	public void setAsText(String uuid) {
		System.out.println(uuid);
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("masuk pak eko!");
		List<Division> divlist = ds.getDivision();
		System.out.println(divlist.size());
		System.out.println(uuid);
		
//		int val = 0;
//		Division d;
//
//		if (uuid.equals("8a9c717c-a885-4fb0-91c0-6a24326a56e6")) {
//			val = 1;
//		} else if (uuid.equals("c0abf3bc-739e-48da-8b8a-c278807f30cb")) {
//			val = 2;
//		} else if (uuid.equals("e43eb220-0e8c-42cb-96c5-3681e4c85a77")) {
//			val = 3;
//		}
//
//		switch (val) {
//		case 1:
//			d = new Division("8a9c717c-a885-4fb0-91c0-6a24326a56e6", "Finance");
//			System.out.println("inside finance");
//			break;
//		case 2:
//			d = new Division("c0abf3bc-739e-48da-8b8a-c278807f30cb", "IT");
//			System.out.println("inside IT");
//			break;
//		case 3:
//			d = new Division("e43eb220-0e8c-42cb-96c5-3681e4c85a77", "Marketing");
//			System.out.println("inside Marketing");
//			break;
//		default:
//			d = null;
//		}
//		this.setValue(d);
	}

}

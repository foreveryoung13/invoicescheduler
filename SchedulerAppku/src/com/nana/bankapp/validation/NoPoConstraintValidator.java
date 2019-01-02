package com.nana.bankapp.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoPoConstraintValidator implements ConstraintValidator<NoPo, String> {

	public String codePrefix;

	@Override
	public void initialize(NoPo code) {
		codePrefix = code.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		boolean result;
		result = false;

		if (code != null) {
			if (code.length() > 3) {
				System.out.println(code.substring(0, 3));
				if (code.substring(0, 3).equals(codePrefix)) {
					result = true;
				}
			}

		}
		return result;
	}

}

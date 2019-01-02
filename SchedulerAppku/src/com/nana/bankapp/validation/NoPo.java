package com.nana.bankapp.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = NoPoConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoPo {

	public String value() default "PO/";
	public String message() default "No Po Should Start with PO/";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default{};
}

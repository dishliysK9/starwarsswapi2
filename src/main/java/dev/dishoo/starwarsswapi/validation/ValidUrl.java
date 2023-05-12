package dev.dishoo.starwarsswapi.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ValidUrlConstraint.class)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUrl {
    String message() default "URLs shouldn't be longer than 39 charakters";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

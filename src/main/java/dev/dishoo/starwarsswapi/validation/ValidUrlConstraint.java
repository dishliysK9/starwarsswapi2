package dev.dishoo.starwarsswapi.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUrlConstraint implements ConstraintValidator<ValidUrl, String> {

    @Override
    public boolean isValid(String urlValue, ConstraintValidatorContext context) {
        if (urlValue.length() >= 40) {
            return false;
        }
        return true;
    }

}

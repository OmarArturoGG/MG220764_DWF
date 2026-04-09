package sv.edu.udb.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DocumentValidator implements ConstraintValidator<ValidDocument, String> {

    @Override
    public boolean isValid(String document, ConstraintValidatorContext context) {
        if (document == null || document.isEmpty()) {
            return false;
        }


        if (document.matches("\\d{8}-\\d{1}")) {
            return true;
        }


        if (document.matches("\\d{4}-\\d{6}-\\d{3}")) {
            return true;
        }

        return false;
    }
}
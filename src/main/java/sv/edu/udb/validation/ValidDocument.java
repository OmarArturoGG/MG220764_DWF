package sv.edu.udb.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DocumentValidator.class)
public @interface ValidDocument {

    String message() default "Documento inválido (debe ser DUI o NIT de El Salvador)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

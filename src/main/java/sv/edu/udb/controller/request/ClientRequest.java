package sv.edu.udb.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import sv.edu.udb.validation.ValidDocument;

@Getter
@Setter
public class ClientRequest {

    @NotBlank(message = "El nombre debe ser obligatorio")
    private String name;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email debe tener un formato valido")
    private String email;

    @NotBlank(message = "El documento es obligatorio")
    @ValidDocument
    private String document;
}

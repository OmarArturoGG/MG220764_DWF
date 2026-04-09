package sv.edu.udb.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.service.ClientService;
import sv.edu.udb.repository.domain.Client;
import sv.edu.udb.controller.request.ClientRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public Client createClient(@Valid @RequestBody ClientRequest request) {
        return clientService.crearCliente(
                request.getName(),
                request.getEmail(),
                request.getDocument()
        );
    }
}
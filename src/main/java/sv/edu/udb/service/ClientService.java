package sv.edu.udb.service;

import org.springframework.stereotype.Service;
import sv.edu.udb.repository.ClientRepository;
import sv.edu.udb.repository.domain.Client;

//Omar Arturo Maldonado Guzman
//MG220764

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client crearCliente(String name, String email, String document) {
        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setDocument(document);

        return clientRepository.save(client);
    }
}
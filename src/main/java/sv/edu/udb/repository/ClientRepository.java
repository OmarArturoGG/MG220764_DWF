package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.repository.domain.Client;

//Omar Arturo Maldonado Guzman
//MG220764

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
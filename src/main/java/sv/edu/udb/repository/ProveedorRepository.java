package sv.edu.udb.repository;

import sv.edu.udb.repository.domain.Producto;
import sv.edu.udb.repository.domain.Proveedor;
import java.util.List;


//MG220764
//Omar Arturo Maldonado Guzman


public interface ProveedorRepository {

    Proveedor guardarProveedor(final String nombre, final List<Producto> productos);
}


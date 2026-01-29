package sv.edu.udb.repository;

import sv.edu.udb.repository.domain.Producto;

//MG220764
//Omar Arturo Maldonado Guzman

public interface ProductoRepository {
    Producto guardarProducto(final String nombre, final Double precio);
}


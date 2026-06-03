package com.ericson.tiendasmartshop.repositories;

import com.ericson.tiendasmartshop.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    boolean existsByNombre(String nombre);
}

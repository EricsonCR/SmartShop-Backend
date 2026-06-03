package com.ericson.tiendasmartshop.controller;

import com.ericson.tiendasmartshop.models.Producto;
import com.ericson.tiendasmartshop.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepository productoRepo;

    @GetMapping("")
    public List<Producto> findAll() {
        return productoRepo.findAll();
    }
}

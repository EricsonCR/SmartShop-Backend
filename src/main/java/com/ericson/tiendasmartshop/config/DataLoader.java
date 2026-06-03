package com.ericson.tiendasmartshop.config;

import com.ericson.tiendasmartshop.models.Producto;
import com.ericson.tiendasmartshop.repositories.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ProductoRepository productoRepo;

    @Override
    public void run(String... args) throws Exception {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(null,"Laptop","laptop hp 14inch 2k RZ 7",3599,15,"",null,null,true));
        productos.add(new Producto(null,"Celular","laptop hp 14inch 2k RZ 7",3599,15,"",null,null,true));
        productos.add(new Producto(null,"Parlante","laptop hp 14inch 2k RZ 7",3599,15,"",null,null,true));
        productos.add(new Producto(null,"Teclado gamer","laptop hp 14inch 2k RZ 7",3599,15,"",null,null,false));

        for (Producto p : productos) {
            if (!productoRepo.existsByNombre(p.getNombre())) {
                productoRepo.save(p);
            }
        }
    }
}

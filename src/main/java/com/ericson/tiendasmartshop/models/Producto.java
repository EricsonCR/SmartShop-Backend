package com.ericson.tiendasmartshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String imagen_url;
    private LocalDateTime fecha_creacion;
    private LocalDateTime fecha_actualizacion;
    private boolean estado;

    @PrePersist
    public void prePersist() {
        this.fecha_creacion = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.fecha_actualizacion = LocalDateTime.now();
    }
}

package com.ericson.tiendasmartshop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(unique = true)
    private String nombre;

    @Column(length = 100)
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
        estado = true;
    }

    @PreUpdate
    public void preUpdate() {
        this.fecha_actualizacion = LocalDateTime.now();
    }
}

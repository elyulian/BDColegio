package com.example.colegio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cubiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ubicacion", nullable = false, length = 50)
    private String ubicacion;

    @OneToOne(mappedBy = "cubiculo")
    private Profesor profesor;
}

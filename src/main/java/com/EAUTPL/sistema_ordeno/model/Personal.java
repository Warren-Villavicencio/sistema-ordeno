package com.EAUTPL.sistema_ordeno.model;



import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Personal")
public class Personal {
    @Id
    @Column(name = "ID_Personal") // Nombre exacto de la columna en la BD
    private Integer idPersonal; // Tipo: Integer, no Long
    private String nombrePersonal;
    private String cargo;
}

    // Getters y setters

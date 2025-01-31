package com.EAUTPL.sistema_ordeno.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Ganado")
public class Ganado {
    @Id
    @Column(name = "ID_Ganado")
    private Integer idGanado;
    private String nombre;
    private String raza;
    private LocalDate fechaNacimiento;
    private String estadoSalud;
}
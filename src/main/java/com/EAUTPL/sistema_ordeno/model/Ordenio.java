package com.EAUTPL.sistema_ordeno.model;


import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Ordeño")
public class Ordenio {
    @Id
    @Column(name = "ID_Ordeño")
    private Integer idOrdenio;

    @ManyToOne
    @JoinColumn(name = "PERSONAL_ID_Personal") // Nombre exacto de la columna en la BD
    private Personal personal;

    @ManyToOne
    @JoinColumn(name = "Ganado_ID_Ganado")
    private Ganado ganado;
}

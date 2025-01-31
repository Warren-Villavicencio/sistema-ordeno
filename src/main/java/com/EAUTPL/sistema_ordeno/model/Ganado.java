package com.EAUTPL.sistema_ordeno.model;


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
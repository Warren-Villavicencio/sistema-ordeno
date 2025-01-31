package com.EAUTPL.sistema_ordeno.model;



@Data
@Entity
@Table(name = "Ordeño")
public class Ordenio {
    @Id
    @Column(name = "ID_Ordeño")
    private Integer idOrdenio;
    private String tipoOrdenio;
    private LocalDate fechaOrdenio;
    private LocalTime horaOrdenio;

    @ManyToOne
    @JoinColumn(name = "PERSONAL_ID_Personal")
    private Personal personal;

    @ManyToOne
    @JoinColumn(name = "Ganado_ID_Ganado")
    private Ganado ganado;
}
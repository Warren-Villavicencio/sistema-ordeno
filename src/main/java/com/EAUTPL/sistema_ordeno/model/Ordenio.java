package com.EAUTPL.sistema_ordeno.model;

import java.time.LocalTime;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Ordenio {


    private String tipoOrdenio;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Anotación agregada
    private Date fechaOrdenio;
    private LocalTime horaOrdenio;
    private Ganado ganado;
    private Personal personal;




    public String getTipoOrdenio() {
        return tipoOrdenio;
    }

    public void setTipoOrdenio(String tipoOrdenio) {
        this.tipoOrdenio = tipoOrdenio;
    }

    public Date getFechaOrdenio() {
        return fechaOrdenio;
    }

    public void setFechaOrdenio(Date fechaOrdenio) {
        this.fechaOrdenio = fechaOrdenio;
    }

    public LocalTime getHoraOrdenio() {
        return horaOrdenio;
    }

    public void setHoraOrdenio(LocalTime horaOrdenio) {
        this.horaOrdenio = horaOrdenio;
    }

    public Ganado getGanado() {
        return ganado;
    }

    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
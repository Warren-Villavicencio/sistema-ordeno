package com.EAUTPL.sistema_ordeno.model;


import java.util.ArrayList;
import java.util.List;

public class Personal {

    private List<Personal> listaPersonal = new ArrayList<>();

    public List<Personal> listarTodos() {
        return listaPersonal;
    }

    public void agregarPersonal(Personal personal) {
        listaPersonal.add(personal);
    }

    // Otros métodos para agregar, eliminar, modificar, etc.
}
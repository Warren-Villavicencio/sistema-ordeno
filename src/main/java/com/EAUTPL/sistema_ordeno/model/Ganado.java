package com.EAUTPL.sistema_ordeno.model;

import java.util.ArrayList;
import java.util.List;

public class Ganado {

    private List<Ganado> listaGanado = new ArrayList<>();

    public Ganado buscarPorId(Integer id) {
        return listaGanado.stream()
                .filter(ganado -> ganado.getIdGanado().equals(id))
                .findFirst()
                .orElse(null);
    }

    private Object getIdGanado() {
        return null;
    }

    public List<Ganado> listarTodos() {
        return listaGanado;
    }

    public void agregarGanado(Ganado ganado) {
        listaGanado.add(ganado);
    }

    // Otros métodos para agregar, eliminar, modificar, etc.
}
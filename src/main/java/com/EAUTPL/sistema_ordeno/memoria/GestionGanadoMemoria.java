package com.EAUTPL.sistema_ordeno.memoria;

import java.util.ArrayList;
import java.util.List;
import com.EAUTPL.sistema_ordeno.model.Ganado;
import org.springframework.stereotype.Component; // Importa la anotación

@Component
public class GestionGanadoMemoria {

    private List<Ganado> listaGanado = new ArrayList<>();

    public GestionGanadoMemoria(List<Ganado> ganados) {
        listaGanado.addAll(ganados);
    }

    public Ganado buscarPorId(Integer idGanado) {
        return null;
    }

    // ... (resto de métodos)
}
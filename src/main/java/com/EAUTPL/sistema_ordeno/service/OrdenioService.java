package com.EAUTPL.sistema_ordeno.service;

import com.EAUTPL.sistema_ordeno.memoria.GestionGanadoMemoria;
import com.EAUTPL.sistema_ordeno.memoria.GestionOrdenioMemoria;
import com.EAUTPL.sistema_ordeno.memoria.GestionPersonalMemoria;
import com.EAUTPL.sistema_ordeno.model.Ganado;
import com.EAUTPL.sistema_ordeno.model.Personal;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.EAUTPL.sistema_ordeno.model.Ordenio; // Importa la clase de entidad

@Service
@RequiredArgsConstructor
public class OrdenioService {

    private final GestionGanadoMemoria gestionGanadoMemoria;
    private final GestionOrdenioMemoria gestionOrdenioMemoria;
    private final GestionPersonalMemoria gestionPersonalMemoria;

    public void registrarOrdenio(Ordenio ordenio, Integer idGanado, Integer idPersonal) {
        Ganado ganado = gestionGanadoMemoria.buscarPorId(idGanado);
        Personal personal = gestionPersonalMemoria.buscarPorId(idPersonal);

        ordenio.setGanado(ganado);
        ordenio.setPersonal(personal);

        gestionOrdenioMemoria.agregarOrdeño(ordenio);
    }
}
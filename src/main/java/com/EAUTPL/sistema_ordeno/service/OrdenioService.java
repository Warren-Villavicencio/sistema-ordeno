package com.EAUTPL.sistema_ordeno.service;

import com.EAUTPL.sistema_ordeno.model.Ganado;
import com.EAUTPL.sistema_ordeno.model.Ordenio;
import com.EAUTPL.sistema_ordeno.model.Personal;
import com.EAUTPL.sistema_ordeno.repository.GanadoRepository;
import com.EAUTPL.sistema_ordeno.repository.OrdenioRepository;
import com.EAUTPL.sistema_ordeno.repository.PersonalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrdenioService {
    private final OrdenioRepository ordenioRepository;
    private final GanadoRepository ganadoRepository;
    private final PersonalRepository personalRepository;

    public void registrarOrdenio(Ordenio ordenio, Integer idGanado, Integer idPersonal) {
        Ganado ganado = ganadoRepository.findById(idGanado).orElseThrow();
        Personal personal = personalRepository.findById(Long.valueOf(idPersonal)).orElseThrow(); // Convertimos el Integer a Long
        ordenio.setGanado(ganado);
        ordenio.setPersonal(personal);
        ordenioRepository.save(ordenio);
    }
    }

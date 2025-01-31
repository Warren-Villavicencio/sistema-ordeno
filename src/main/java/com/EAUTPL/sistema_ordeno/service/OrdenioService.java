package com.EAUTPL.sistema_ordeno.service;

@Service
@RequiredArgsConstructor
public class OrdenioService {
    private final OrdenioRepository ordenioRepository;
    private final GanadoRepository ganadoRepository;
    private final PersonalRepository personalRepository;

    public void registrarOrdenio(Ordenio ordenio, Integer idGanado, Integer idPersonal) {
        Ganado ganado = ganadoRepository.findById(idGanado).orElseThrow();
        Personal personal = personalRepository.findById(idPersonal).orElseThrow();
        ordenio.setGanado(ganado);
        ordenio.setPersonal(personal);
        ordenioRepository.save(ordenio);
    }
}
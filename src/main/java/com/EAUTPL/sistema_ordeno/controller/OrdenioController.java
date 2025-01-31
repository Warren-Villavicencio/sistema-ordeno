package com.EAUTPL.sistema_ordeno.controller;

import com.EAUTPL.sistema_ordeno.model.Ordenio;
import com.EAUTPL.sistema_ordeno.service.OrdenioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class OrdenioController {
    private final OrdenioService ordenioService;

    @GetMapping("/ordenio")
    public String mostrarFormulario(Model model) {
        model.addAttribute("ordenio", new Ordenio());
        return "ordenio-form";
    }

    @PostMapping("/registrar-ordenio")
    public String registrarOrdenio(@ModelAttribute Ordenio ordenio,
                                   @RequestParam Integer idGanado,
                                   @RequestParam Integer idPersonal) {
        ordenioService.registrarOrdenio(ordenio, idGanado, idPersonal);
        return "redirect:/ordenio";
    }
}


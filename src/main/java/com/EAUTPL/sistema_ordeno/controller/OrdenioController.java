package com.EAUTPL.sistema_ordeno.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EAUTPL.sistema_ordeno.model.Ordenio;
import com.EAUTPL.sistema_ordeno.service.OrdenioService;

@Controller
public class OrdenioController {

    @Autowired
    private OrdenioService ordenioService;

    @GetMapping("/ordenio")
    public String mostrarFormulario(Model model) {
        model.addAttribute("ordenio", new Ordenio());
        return "ordenio-form";
    }

    @PostMapping("/registrar-ordenio")
    public String registrarOrdenio(@ModelAttribute Ordenio ordenio,
                                   @RequestParam("idGanado") Integer idGanado,
                                   @RequestParam("idPersonal") Integer idPersonal) {

        ordenioService.registrarOrdenio(ordenio, idGanado, idPersonal);
        return "redirect:/ordenio"; // Redirige a la página de ordeños
    }
}
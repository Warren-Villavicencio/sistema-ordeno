package com.EAUTPL.sistema_ordeno.controller;
@Controller
public class MenuController {
    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}
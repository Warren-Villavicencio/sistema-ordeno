package com.EAUTPL.sistema_ordeno.controller;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
package org.example.gestiontournoismvc.controller;

import org.example.gestiontournoismvc.service.SimpleEliminationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tournois/simple")
class SimpleEliminationController {

    private SimpleEliminationService simpleEliminationService;

    @GetMapping
    public String simpleElimination(Model model) {

        simpleEliminationService.getSimpleEliminations();

        model.addAttribute("simpleEliminations", simpleEliminationService.getSimpleEliminations());

        return "simpleElimination/Index";
    }

}

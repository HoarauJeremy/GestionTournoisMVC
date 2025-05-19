package org.example.gestiontournoismvc.controller;

import org.example.gestiontournoismvc.entity.SimpleElimination;
import org.example.gestiontournoismvc.service.SimpleEliminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("tournois/simple")
class SimpleEliminationController {

    @Autowired
    private SimpleEliminationService simpleEliminationService;

    @GetMapping
    public String simpleElimination(Model model) {

//        List<SimpleElimination> simpleEliminations = simpleEliminationService.getSimpleEliminations();

        /*if (!simpleEliminations.isEmpty()) {
            model.addAttribute("simpleEliminations", simpleEliminations);
            return "simpleElimination/Index";
        } else {
            return "error";
        }*/

        model.addAttribute("simpleElimination", simpleEliminationService.getSimpleEliminations());

        return "simpleElimination/Index";
    }

    @GetMapping("/{id}")
    public String simpleElimination(Model model, @PathVariable Long id) {
        if (simpleEliminationService.simpleEliminationExist(id)) {
            model.addAttribute("simpleElimination"); simpleEliminationService.getSimpleEliminationById(id);
            return "simpleElimination/show";
        } else {
            model.addAttribute("errorTitle", "404 Not Found");
            model.addAttribute("errorMessage", "Ce tournois n'existe pas");
            return "error";
        }
    }

}

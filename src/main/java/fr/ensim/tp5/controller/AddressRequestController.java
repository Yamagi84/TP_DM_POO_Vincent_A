package fr.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressRequestController {

    @GetMapping("/adresse")
    public String adresse(Model model) {
        return "adresse";
    }
}

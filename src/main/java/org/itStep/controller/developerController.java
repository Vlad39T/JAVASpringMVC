package org.itStep.controller;

import org.itStep.DAO.DeveloperDAO;
import org.itStep.Model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class developerController {

    private final DeveloperDAO developerDAO;

    @Autowired
    public developerController(DeveloperDAO developerDAO) {
        this.developerDAO = developerDAO;
    }

    @GetMapping("/developers")
    public String getAllDevelopers(Model model) {
        List<Developer> developers = developerDAO.getAll();
        model.addAttribute("dev", developers);
        return "developers";
    }

    @GetMapping("/developer/form")
    public String developerForm() {
        return "form";
    }

    @PostMapping("/developer/form")
    public String postDeveloperForm(@ModelAttribute Developer developer) {
        developerDAO.save(developer);
        return "redirect:/developers";
    }

    @GetMapping("/showDeveloper/{phone}")
    public String getDev(@PathVariable String phone, Model model) {
        Developer byPhone = developerDAO.getByPib(phone);
        model.addAttribute("showDev",byPhone);
        return "developer";
    }

}

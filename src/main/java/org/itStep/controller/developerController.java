package org.itStep.controller;

import org.itStep.DAO.DeveloperDAO;
import org.itStep.DAO.hibernate.DeveloperHibernate;
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

    private final DeveloperHibernate developerHibernate;

    @Autowired
    public developerController( DeveloperHibernate developerHibernate) {
        this.developerHibernate = developerHibernate;
    }

    @GetMapping("/developers")
    public String getAllDevelopers(Model model) {
        List<Developer> developersAll = developerHibernate.getAll();
        model.addAttribute("developers", developersAll);
        return "developers";
    }

    @GetMapping("/developer/form")
    public String developerForm() {
        return "form";
    }

    @PostMapping("/developer/form")
    public String postDeveloperForm(@ModelAttribute Developer developer) {
        Developer developerById = null;
        if (developer.getIdDeveloper() != null) {
            developerById = developerHibernate.getById(developer.getIdDeveloper());
        }

        if (developerById == null) {
            developerHibernate.save(developer);
        } else {
            developerHibernate.update(developer);
        }
        return "redirect:/developers";
    }


    @GetMapping("/showDeveloper/{phone}")
    public String getDev(@PathVariable String phone, Model model) {
        Developer byPhone = developerHibernate.getByPhone(phone);
        model.addAttribute("showDev",byPhone);
        return "developer";
    }


    @GetMapping("/update/developer/{idDeveloper}")
    public String update(@PathVariable(name = "idDeveloper") Integer idDeveloper, Model model) {
        Developer developerById = developerHibernate.getById(idDeveloper);
        model.addAttribute("developer", developerById);
        return "form";
    }

    @GetMapping("/delete/developer/{idDeveloper}")
    public String delete(@PathVariable(name = "idDeveloper") Integer id) {
        developerHibernate.delete(id);
        return "redirect:/developers";
    }

}

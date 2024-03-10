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
        if (developer.getId() != null) {
            developerById = developerHibernate.getById(developer.getId());
        }

        if (developerById == null) {
            developerHibernate.save(developer);
        } else {
            developerHibernate.update(developer);
        }
        return "redirect:/developers";
    }

    @GetMapping("/showDeveloper/{id}")
    public String getDev(@PathVariable int id, Model model) {
        Developer byPhone = developerHibernate.getById(id);
        model.addAttribute("showDev",byPhone);
        return "developer";
    }


    @GetMapping("/updateInfo/developer/{idDeveloper}")
    public String update(@PathVariable(name="idDeveloper")Integer idDeveloper, Model model){
        Developer developerById= developerHibernate.getById(idDeveloper);
        model.addAttribute("developer",developerById);
        return "form";
    }
    @GetMapping("/deleteInfo/developer/{idDeveloper}")
    public String delete(@PathVariable(name ="idDeveloper") Integer id){
        developerHibernate.delete(id);
        return "redirect:/developers";
    }

}

package com.spring.test.web;

import com.spring.dao.PersonaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired(required = false)
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDao.findAll();
        log.info("ejecutando controlador MVC");
        model.addAttribute("personas", personas);
        return "index";
    }

}

package com.server.controller;

import com.server.domain.Person;
import com.server.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String personList(Model model) {

        List<Person> personList = personService.listPersons();

        model.addAttribute("personList", personList);
        return "person_list";
    }
}

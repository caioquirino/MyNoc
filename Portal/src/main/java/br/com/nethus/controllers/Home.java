package br.com.nethus.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramon on 07/04/16.
 */
@Controller

public class Home {

    @RequestMapping(value = "/Principal", method = RequestMethod.GET)
    public String principal() {
        return "home/principal.xhtml";
    }

}

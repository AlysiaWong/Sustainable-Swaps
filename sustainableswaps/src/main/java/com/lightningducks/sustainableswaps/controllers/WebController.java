package com.lightningducks.sustainableswaps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String getHome() {
        return "home.html";
    }

}

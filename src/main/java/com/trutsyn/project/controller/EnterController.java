package com.trutsyn.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Sergey Trutsyn 05.08.2022
 */
@Controller
@RequestMapping("/carsharing")
public class EnterController {

    @GetMapping("/enter")
    public String resolveEnter(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                               Model model) {

//        System.out.println(name + " -- " + surname);
        model.addAttribute("name", "Hello " + name + " " + surname);

        return "enter";
    }

    @GetMapping("/authorization")
    public String authorization() {
        return "authorization";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             @RequestParam(value = "action", required = false) String action,
                             Model model) {
        double result;

        if (action.equals("multiplication")) {
            result = a * b;
        } else if (action.equals("division")) {
            result = a / (double)b;
        } else if (action.equals("subtraction")) {
            result = a - b;
        } else if (action.equals("addition")) {
            result = a + b;
        } else {
            result = 0;
        }

        model.addAttribute("result", result);

        return "calculator";
    }
}

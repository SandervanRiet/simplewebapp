package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){

        return "about";
    }

    @GetMapping({"/", "/home"})
    public String home(Model model, Principal principal) {
        final String loginName = principal==null ? "NOBODY" : principal.getName();
        return "home";
    }


}

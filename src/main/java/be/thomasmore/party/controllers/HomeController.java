package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        String myName= "Sander";
        model.addAttribute("myName", myName);
        String myCity = "Schelle";
        model.addAttribute("myCity", myCity);
        String myStreet= "goedendagtraat";
        model.addAttribute("myStreet", myStreet);
        return "about";
    }
    @GetMapping("/pay")
    public String pay(Model model) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
        model.addAttribute("dateNow", formatDateTime);
        boolean weekend=false;
        if (now.getDayOfWeek().equals(DayOfWeek.SATURDAY) || now.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            weekend=true;
        } weekend= false;
        model.addAttribute("weekend", weekend);

        LocalDateTime later = now.plusDays(30);
        String timeToPay = later.format(format);
        model.addAttribute("dateLater", timeToPay);
        return "pay";
    }


}

package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Ride;

import be.thomasmore.party.repositories.RideRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class RideController {
    @Autowired
    private RideRepository venueRepository;


    @GetMapping({"ridedetails"})
    public String rideDetails(Model model) {

        return "ridedetails";
    }

    @GetMapping({"/ridelist"})
    public String ridelist(Model model) {

        return "ridelist";
    }

}

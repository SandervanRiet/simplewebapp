package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Ride;
import be.thomasmore.party.repositories.RideRepository;
import be.thomasmore.party.repositories.StartingPointRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
@Controller
@RequestMapping("/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private RideRepository rideRepository;
    @Autowired
    private StartingPointRepository startingPointRepository;
    

    @ModelAttribute("ride")
    public Ride findRide(@PathVariable(required = false) Integer id) {
        logger.info("findride "+id);
        if (id!=null) {
            Optional<Ride> optionalRide = rideRepository.findById(id);
            if (optionalRide.isPresent()) return optionalRide.get();
        }
        return new Ride();
    }

    @GetMapping("/rideedit/{id}")
    public String rideEdit(Model model, @PathVariable int id) {
        logger.info("rideedit : "+id);
        model.addAttribute("startingPoints", startingPointRepository.findAll());
        return "admin/rideedit";
    }

    @PostMapping("/rideedit/{id}")
    public String rideEditPost(Model model, @PathVariable int id,
                                @RequestParam(required = false) Integer[] artistIds,
                                @Valid @ModelAttribute("ride") Ride ride, BindingResult bindingResult) {
        logger.info("rideEditPost " + id + " -- new name=" + ride.getName());
        if (bindingResult.hasErrors()) {
            model.addAttribute("startingPoints", startingPointRepository.findAll());
            return "admin/rideedit";
        }
        rideRepository.save(ride);
        return "redirect:/ridedetails/"+id;
    }

    @GetMapping("/ridenew")
    public String rideNew(Model model) {
        logger.info("ridenew");
        model.addAttribute("startingPoints", startingPointRepository.findAll());
        return "admin/ridenew";
    }

    @PostMapping("/ridenew")
    public String rideNewPost(Model model,
                               @Valid @ModelAttribute("ride") Ride ride, BindingResult bindingResult) {
        logger.info("rideNewPost -- new name=" + ride.getName() + ", date=" + ride.getDate());
        if (bindingResult.hasErrors()) {
            model.addAttribute("startingPoints", startingPointRepository.findAll());
            return "admin/ridenew";
        }
        rideRepository.save(ride);
        return "redirect:/ridedetails/"+ride.getId();
    }
}
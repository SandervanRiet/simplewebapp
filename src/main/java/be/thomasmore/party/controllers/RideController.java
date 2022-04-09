package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Ride;

import be.thomasmore.party.repositories.RideRepository;
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
    private RideRepository rideRepository;


    @GetMapping({"/ridedetails/{id}","/ridedetails"})
    public String rideDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "ridedetails";
        Optional<Ride> optionalRide = rideRepository.findById(id);
        Optional<Ride> optionalPrev = rideRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Ride> optionalNext = rideRepository.findFirstByIdGreaterThanOrderById(id);
        if (optionalRide.isPresent()) {
            model.addAttribute("ride", optionalRide.get());
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", rideRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", rideRepository.findFirstByOrderByIdAsc().get().getId());
        }

        return "ridedetails";
    }

    @GetMapping({"/ridelist"})
    public String ridelist(Model model) {
        Iterable <Ride> allRides = rideRepository.findAll();
        model.addAttribute("rides", allRides);
        return "ridelist";
    }

    @GetMapping("/ridelist/filter")
    public String rideListWithFilter(Model model,
                                      @RequestParam(required = false) Double minimumDistance,
                                      @RequestParam(required = false) Double maximumDistance
    ) {
        Iterable<Ride> rides = rideRepository.findByDistance(minimumDistance, maximumDistance);
        model.addAttribute("maxDistance", maximumDistance);
        model.addAttribute("minDistance", minimumDistance);
        model.addAttribute("rides", rides);
        model.addAttribute("showFilter", true);
        return "ridelist";
    }

}

package be.thomasmore.party.controllers;

import be.thomasmore.party.model.StartingPoint;
import be.thomasmore.party.repositories.RideRepository;
import be.thomasmore.party.repositories.StartingPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.Optional;

@Controller
public class StartingPointController {
    @Autowired
    private StartingPointRepository startingPointRepository;
    @Autowired
    private RideRepository rideRepository;


    @GetMapping({"/startingpointdetails/{id}","/startingpointdetails"})
    public String rideDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id==null) return "ridedetails";
        Optional<StartingPoint> optionalStartingPoint = startingPointRepository.findById(id);
        Optional<StartingPoint> optionalPrev = startingPointRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<StartingPoint> optionalNext = startingPointRepository.findFirstByIdGreaterThanOrderById(id);
        if (optionalStartingPoint.isPresent()) {
            model.addAttribute("startingpoint", optionalStartingPoint.get());
            model.addAttribute("rides",rideRepository.findByStartingPoint(optionalStartingPoint.get()));
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", startingPointRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", startingPointRepository.findFirstByOrderByIdAsc().get().getId());
        }

        return "startingpointdetails";
    }

    @GetMapping({"/startingpointlist"})
    public String ridelist(Model model) {
        Iterable <StartingPoint> allstartingpoints = startingPointRepository.findAll();
        model.addAttribute("startingpoints", allstartingpoints);
        return "startingpointlist";
    }

    @GetMapping("/startingpointlist/filter")
    public String startingPointListWithFilter(Model model,
                                      @RequestParam(required = false) String pubNearby,
                                      @RequestParam(required = false) String foodshopNearby) {
        List<StartingPoint> startingPoints = startingPointRepository.findBypubNearbyfoodshopNearby(
                ((pubNearby==null || pubNearby.equals("all")) ? null : (pubNearby.equals("yes") ? true : false)),
                ((foodshopNearby==null ||foodshopNearby.equals("all")) ? null : (foodshopNearby.equals("yes") ? true : false)));
        model.addAttribute("foodshopNearby", foodshopNearby);
        model.addAttribute("pubNearby",  pubNearby);
        model.addAttribute("startingpoints",startingPoints);
        model.addAttribute("showFilter", true);
        return "startingpointlist";
    }



}

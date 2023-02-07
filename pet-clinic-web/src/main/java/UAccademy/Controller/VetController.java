package UAccademy.Controller;

import UAccademy.Service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vet","/vet/index","/vet/index.html","/vets.html","/vets"})
    public String listVet(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vet/VetIndex";
    }

}

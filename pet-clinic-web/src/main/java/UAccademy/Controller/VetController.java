package UAccademy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vet","/vet/index","/vet/index.html"})
    public String listVet(){
        return "vet/VetIndex";
    }

}

package UAccademy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owner","/owner/index","/owner/index.html"})
    public String listOwner(){
        return "owner/OwnerIndex";
    }

}
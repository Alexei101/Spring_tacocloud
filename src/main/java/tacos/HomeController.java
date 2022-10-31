package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
final int count = 0;
    @GetMapping("/")
    public String home(){
        return "home";
    }

}

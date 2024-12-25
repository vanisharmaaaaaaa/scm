package com.pr.scmcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page Controller");
        // sending data to view
        model.addAttribute("name", "Avantika Singh");
        model.addAttribute("youtubeChannel", "https://www.youtube.com/watch?v=e6FqC4pWy8I");
        model.addAttribute("githubRepo", "https://github.com/vanisharmaaaaaaa");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page loading");
        return "about";
    }

    // services route
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page loading");
        return "services";
    }
}

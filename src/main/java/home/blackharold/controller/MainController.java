package home.blackharold.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping ("/hello")
    public String getHelloPage() {
        return "hello";
    }
    
    @RequestMapping ("/")
    public String getMainPage() {
        return "index";
    }
}

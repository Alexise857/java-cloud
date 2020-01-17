package pe.example.demojava.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //redirigir el trafico, redirijimos a greting
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required =  false, defaultValue = "Alexis") String name,
                           Model model){

        model.addAttribute("name",name);
        return  "greeting";//es un pagina html que nos falta crear

    }
}

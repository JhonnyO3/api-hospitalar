package med.vol.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Sinaliza que a classe é uma controller
@RequestMapping("/hello") // Passa o Path da classe
public class HelloController {


    @GetMapping //Request GET
    public String helloWOrld() {
        return "Hello World Spring";
    }
}

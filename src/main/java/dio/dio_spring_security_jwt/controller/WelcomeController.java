package dio.dio_spring_security_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to the Dio Spring Security JWT!";
    }

    @GetMapping("/managers")
    public String managers(){
        return "Authorized Manager, Welcome!";
    }

    @GetMapping("/users")
    public String users(){
        return "Authorized User, Welcome!";
    }
}

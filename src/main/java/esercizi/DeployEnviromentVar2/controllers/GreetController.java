package esercizi.DeployEnviromentVar2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetEnviroment")
public class GreetController {

    @Autowired
    Environment environment;


    @GetMapping
    public ResponseEntity<String> greetEnviroment(){

        return ResponseEntity.ok(environment.getProperty("welcomeMsg"));

    }

}

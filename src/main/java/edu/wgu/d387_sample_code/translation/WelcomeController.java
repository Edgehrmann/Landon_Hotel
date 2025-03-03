package edu.wgu.d387_sample_code.translation;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WelcomeController {

    private final WelcomeServiceImpl welcomeService;

    @Autowired
    public WelcomeController(WelcomeServiceImpl welcomeService) {

        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome() throws JsonProcessingException, InterruptedException {

        this.welcomeService.startService();
        return welcomeService.getJsonList();
    }
}
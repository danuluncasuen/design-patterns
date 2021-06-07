package org.utm.dp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.utm.dp.service.RiddleService;

@RestController
public class MainController {

    private final RiddleService riddleService;

    public MainController(RiddleService riddleService) {
        this.riddleService = riddleService;
    }

    @GetMapping("/")
    public ModelAndView mainPage() {
        riddleService.populateWithRiddles();
        return new ModelAndView("registerPage.html");
    }

    @GetMapping("/test/clone")
    public ResponseEntity<?> responseEntity() {
        return new ResponseEntity<>(riddleService.callTestClone(), HttpStatus.OK);
    }

}

package org.jfcmc.boot.web.controller;

// import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.jfcmc.boot.web.service.AdderService;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class RootController {

    private final AdderService adder;

    public RootController(AdderService adder) {
        this.adder = adder;
    }

    @GetMapping("/")
    public String get() {
        return "main.html";
    }

    @GetMapping("/form")
    public String form() {
        return "form.html";
    }

    @PostMapping("/add")
    public String post(@RequestParam Integer number1,
                       @RequestParam Integer number2,
                       Model model) {
        Integer result = number1 + number2;
        model.addAttribute("result", result);

        return "form.html";
    }

    @GetMapping("/get/result")
    public ResponseEntity<Integer> result() {
        return ResponseEntity.status(OK).body(adder.getResult());
    }

    @PutMapping("/put/{variable}")
    public ResponseEntity<Void> variable(@RequestBody String value,
                                         @PathVariable String variable){
        try {

            Integer intValue = Integer.parseInt(value);
            adder.addVariables(variable, intValue);
        }
        catch (NumberFormatException nfe) { }

        return new ResponseEntity<>(OK);
    }
}

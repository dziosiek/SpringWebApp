package com.studies.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsApplicationController {
    @GetMapping(path = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(path = "/carlist")
    public String carList(@RequestParam(name = "typeOfCar") String typeOfCar,
                          @RequestParam(name = "carBrand") String carBrand,
                          @RequestParam(name = "yearOfProduction") String yearOfProduction,
                          @RequestParam(name = "fuelConsumption") String fuelConsumption) {



        return "carlist";
    }
}
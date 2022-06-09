package com.example.testserverforvue.controllers;

import com.example.testserverforvue.Models.Car;
import com.example.testserverforvue.dtos.CarsDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/cars")
public class CarsController {
    @GetMapping
    public CarsDto getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(500, "model s"));
        cars.add(new Car(300, "model t"));
        cars.add(new Car(230, "model x"));

        return new CarsDto(cars);
    }
}

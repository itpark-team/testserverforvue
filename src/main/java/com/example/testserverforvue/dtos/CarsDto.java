package com.example.testserverforvue.dtos;

import com.example.testserverforvue.Models.Car;

import java.util.List;

public class CarsDto {
    private List<Car> cars;

    public CarsDto(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}

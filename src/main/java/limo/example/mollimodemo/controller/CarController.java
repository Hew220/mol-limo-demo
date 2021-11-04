package limo.example.mollimodemo.controller;

import limo.example.mollimodemo.model.Car;
import limo.example.mollimodemo.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping("api/car")
    public ResponseEntity<Car> save(@RequestBody Car car) {
        return ResponseEntity.ok(carService.saveCar(car));
    }
}

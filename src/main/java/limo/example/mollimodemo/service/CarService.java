package limo.example.mollimodemo.service;

import limo.example.mollimodemo.model.Car;
import limo.example.mollimodemo.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
}

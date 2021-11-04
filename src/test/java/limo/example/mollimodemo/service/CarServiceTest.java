package limo.example.mollimodemo.service;

import limo.example.mollimodemo.model.Car;
import limo.example.mollimodemo.model.CarType;
import limo.example.mollimodemo.model.GearType;
import limo.example.mollimodemo.model.Status;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarServiceTest {

    @Autowired
    CarService carService;

    @Test
    public void persistAndReadCar() {

        Car car = Car.builder()
                .id(null)
                .carType(CarType.SMART_EQ)
                .gearType(GearType.MANUAL)
                .status(Status.CREATED)
                .build();

        Assertions.assertThat(car.getId()).isNull();

        carService.saveCar(car);

        Assertions.assertThat(car.getId()).isNotNull();
    }

}
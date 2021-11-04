package limo.example.mollimodemo.model;

public class Car {

    private  CarType carType;
    private  GearType gearType;
    private  Status status;

    public Car(CarType carType, GearType gearType, Status status) {
        this.carType = carType;
        this.gearType = gearType;
        this.status = status;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", gearType=" + gearType +
                ", status=" + status +
                '}';
    }
}

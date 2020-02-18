import emums.BodyType;
import emums.Color;
import emums.TypeTyre;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    Body body;
    Wheel wheel;
    SteeringWheel steeringWheel;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
        brand = "standart";
        model = "standart";
        this.body = new Body(Color.WHITE, BodyType.COUPE);
        this.steeringWheel = new SteeringWheel(false, 5);
        this.wheel = new Wheel(30, TypeTyre.SUMMER);
    }

    public Car(String brandauto, String modelauto, Color color, BodyType bodyType, int wheelRadius, TypeTyre typeTyre, int radiusSteeringWheel, boolean buttonsOnSteeringWheel) {
        this.brand = brandauto;
        this.model = modelauto;
        this.wheel = new Wheel(wheelRadius, typeTyre);
        this.body = new Body(color, bodyType);
        this.steeringWheel = new SteeringWheel(buttonsOnSteeringWheel, radiusSteeringWheel);

    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheels(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(body, car.body) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(steeringWheel, car.steeringWheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, body, wheel, steeringWheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", body=" + body +
                ", wheel=" + wheel +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}

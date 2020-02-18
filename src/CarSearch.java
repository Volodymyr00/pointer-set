import emums.TypeTyre;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CarSearch {
    private Scanner scanInt = new Scanner(System.in);
    private Scanner scanStr = new Scanner(System.in);

    private Set<Car> carSet;

    public CarSearch(Set<Car> carSet) {
        this.carSet = carSet;
    }

    void changeWheelForBodyColorAndWheelRadius() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Write color od body - ");
        String inputColor = scanStr.nextLine();
        System.out.println("Write R` of wheels - ");
        int inputRadius = scanInt.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.body.getColor().toString().equals(inputColor) && car.wheel.getWheelRadius() == inputRadius) {
                System.out.println("Write type of tyres - ");
                TypeTyre inputTypeTyre = TypeTyre.valueOf(scanStr.nextLine().toUpperCase());
                car.getWheel().setTypeTyre(inputTypeTyre);
            }

        }
    }

    public void deletedCarInputWheelsRadius() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Input wheel R`:");
        int inputRadius = scanInt.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getWheel().getWheelRadius() == inputRadius) {
                carIterator.remove();
                System.out.println(car.getModel() + " " + "/remove");
            }
        }
    }

    public void searchingWheelTypeAndWheelRadius() {
        Iterator<Car> carIterator = carSet.iterator();
        System.out.println("Write type tyres - ");
        String inputType = scanStr.nextLine();
        System.out.println("Write lower R`  to exchanging  - ");
        int inputRadiusLow = scanInt.nextInt();
        System.out.println("Write upper R` to exchanging  - ");
        int inputRadiusUp = scanInt.nextInt();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getWheel().getTypeTyre() == TypeTyre.valueOf(inputType) &&
                    car.getWheel().getWheelRadius() >= inputRadiusLow && car.getWheel().getWheelRadius() <= inputRadiusUp) {
                System.out.println(car.getModel());
            }
        }
    }
}
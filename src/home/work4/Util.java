package home.work4;

import java.util.Random;

public class Util {
    public Car sitInCar(Car car, Passager passager) {
        if (car.getCapacity() > 1 && car.getCapacity() >= car.getPassagers().length + 1) {
            for (int countOfPlace = 0; countOfPlace < car.getPassagers().length; countOfPlace++) {
                if (car.getPassagers()[countOfPlace] == null) {
                    car.getPassagers()[countOfPlace] = passager;
                    System.out.println(passager.getNamePassager() + " sat on the place #" + countOfPlace + " into car " + car.getMark());
                    break;
                } else {
                    if (countOfPlace == car.getPassagers().length - 1) {
                        System.out.println("Sorry our car " + car.getMark() + " this place is full");
                    }
                }
            }
        } else {
            System.out.println("In the car there are no empty seats! (there is a driver)");
        }
        return car;
    }

    public Car getOutOfCar(Car car, Passager passager) {
        for (int countOfPass = 0; countOfPass < car.getPassagers().length; countOfPass++) {
            if (car.getPassagers()[countOfPass] != null && car.getPassagers()[countOfPass].equals(passager)) {
                car.getPassagers()[countOfPass] = null;
                System.out.println(passager.getNamePassager() + " got out of car. Place #" + countOfPass + " was freed.");
                break;
            } else {
                if (countOfPass == car.getPassagers().length - 1) {
                    System.out.println(passager.getNamePassager() + " is not in the car :(");
                }
            }
        }
        return car;
    }

    public Car getOutOfCar(Car car, int passengerNumber) {
        if (car.getPassagers().length > passengerNumber && car.getPassagers()[passengerNumber] != null) {
            System.out.println(car.getPassagers()[passengerNumber].getNamePassager() + " got out of car. Place #" + passengerNumber + " was freed.");
            car.getPassagers()[passengerNumber] = null;
        } else {
            System.out.println("Place #" + passengerNumber + " was not taken");
        }
        return car;
    }

    public Car startStopEngine(Car car, int signal) {
        System.out.print(car.getModel() + " " + car.getMark());
        if (signal == 1) {
            System.out.println(" is engine started");
            car.getEngine().setRun(true);
        } else {
            System.out.println(" is engine stopped");
            car.getEngine().setRun(false);
        }
        return car;
    }

    public void carIsDriving(Car car[]) {
        for (Car cars : car) {
            System.out.print(cars.getModel() + " " + cars.getMark());
            if (cars.getEngine().isRun()) {
                System.out.println(" is driving");
            } else {
                System.out.println(" is not driving");
            }
        }
    }

    public Passager passengerEats(Passager passager) {
        System.out.println(passager.getNamePassager() + " eats");
        return passager;
    }

    public int checkFuel(Car car) {
        Random rand = new Random();
        int distance = rand.nextInt(1000 + 1);
        double consumption = (double) car.getEngine().getHorsePower() / 1000 * (double) car.getEngine().getSpeed() * 0.2 / 10;
        if (consumption * distance < car.getAmountOfFuel()) {
            System.out.println("You can go :-)");
            return distance;
        } else {
            System.out.println("There is not enough fuel on "+distance+" km");
            return -1;
        }
    }

}

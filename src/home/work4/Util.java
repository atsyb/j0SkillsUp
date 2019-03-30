package home.work4;

import java.util.Random;

public class Util {
    public Car sitInCar(Car car, Passager passager) {
        if (car.getCapacity() > 1 && car.getCapacity() <= car.getPassagers().length) {
            for (int countOfPass = 0; countOfPass < car.getPassagers().length; countOfPass++) {
                if (car.getPassagers()[countOfPass] == null) {
                    car.getPassagers()[countOfPass] = passager;
                    break;
                } else {
                    System.out.println("Sorry our car this place is full");
                }
            }
        }
        return car;
    }

    public Car getOutOfCar(Car car, Passager passager) {
        for (int countOfPass = 0; countOfPass < car.getPassagers().length; countOfPass++) {
            if (car.getPassagers()[countOfPass].equals(passager)) {
                car.getPassagers()[countOfPass] = null;
                System.out.println("This place of passangers is free.");
            }
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

    public boolean checkFuel(Car car) {
        Random rand = new Random();
        int distance = rand.nextInt(1000 + 1);
        double consumption = (double) car.getEngine().getHorsePower() / 1000 * (double) car.getEngine().getSpeed() * 0.2 / 10;
        if (consumption * distance < car.getAmountOfFuel()) {
            System.out.println("We reach the destination");
            return true;
        } else {
            System.out.println("There is not enough fuel");
            return false;
        }
    }

}

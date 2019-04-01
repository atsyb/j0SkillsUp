package home.work4;


import java.util.Random;

public class Main4 {
    public static final int ENGINE_START = 1;
    public static final int ENGINE_STOP = 2;

    public static void main(String[] args) {
        System.out.println("__SkillsUp:HomeWork4__\n");

        final boolean IS_START = true;

        Car car1 = new Car(1000, "sedan", "Japan", "Toyota", "Camry", new Engine(90, 60), new Passager[3], 4, 140);
        Car car2 = new Car(2000, "sedan", "USA", "Honda", "Civic", new Engine(80, 80), new Passager[4], 6, 30);
        Util u = new Util();
        Passager passager1 = new Passager("Sasha", 39);
        Passager passager2 = new Passager("Vova", 19);
        Passager passager3 = new Passager("Masha", 18);
        Passager passager4 = new Passager("Roma", 7);

        int plannedDistance = u.checkFuel(car1);

        if (plannedDistance > 0) {
            car1 = u.sitInCar(car1, passager1);
            car1 = u.sitInCar(car1, passager2);
            car1 = u.sitInCar(car1, passager3);
            car1 = u.sitInCar(car1, passager4);
            System.out.println(car1.toString());

            u.startStopEngine(car1, ENGINE_START);
            Random rand = new Random();
            int distanceToFirstStop = rand.nextInt(plannedDistance + 1);
            System.out.println("  Distance according to plan: " + plannedDistance + " km");
            System.out.println("  Distance to first stop: " + distanceToFirstStop + " km");
            u.startStopEngine(car1, ENGINE_STOP);
            car1 = u.getOutOfCar(car1, passager1);
            car1 = u.getOutOfCar(car1, 2);
            u.passengerEats(passager1);
            u.passengerEats(passager2);
            car1 = u.sitInCar(car1, passager1);
            car1 = u.sitInCar(car1, passager2);
            u.startStopEngine(car1, ENGINE_START);
            u.carIsDriving(new Car[]{car1});

            System.out.println("  We reach the destination");
            u.startStopEngine(car1, ENGINE_STOP);
            car1 = u.getOutOfCar(car1, passager1);
            car1 = u.getOutOfCar(car1, passager2);

        } else {
            System.out.println("We do not eat anywhere. Fly by plane.");
        }

    }
}

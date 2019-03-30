package home.work4;


public class Main4 {
    public static final int ENGINE_START = 1;
    public static final int ENGINE_STOP = 2;

    public static void main(String[] args) {
        System.out.println("__SkillsUp:HomeWork4__\n");

        final boolean IS_START = true;

        Car c1 = new Car(1000, "sedan", "Japan", "Toyota", "Camry", new Engine(90, 60), new Passager[1], 4, 40);
        Car c2 = new Car(2000, "sedan", "USA", "Honda", "Civic", new Engine(80, 80), new Passager[0], 6, 30);
        Util u = new Util();
        Passager p1 = new Passager("Sasha", 39);
        Passager p2 = new Passager("Vova", 19);
        Passager p3 = new Passager("Masha", 18);
        Passager p4 = new Passager("Roma", 7);

        if (u.checkFuel(c1)) {
            c1 = u.startStopEngine(c1, ENGINE_START);
            u.carIsDriving(new Car[]{c1,c2});
        } else {
            System.out.println("We do not eat anywhere. Fly by plane.");
        };





    }
}

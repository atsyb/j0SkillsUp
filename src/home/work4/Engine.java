package home.work4;

import java.util.Objects;

public class Engine {
    private int speed;
    private int horsePower;
    private boolean run;

    public Engine(int speed, int horsePower) {
        this.speed = speed;
        this.horsePower = horsePower;
    }
    public Engine(){
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return speed == engine.speed &&
                horsePower == engine.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, horsePower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "speed=" + speed +
                ", horsePower=" + horsePower +
                '}';
    }

}

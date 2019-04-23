package home.work5.Rada;

import java.util.Objects;

public class Deputy {
    private String name;
    private boolean bribeTaker;

    public Deputy(String name, boolean bribeTaker) {
        this.name = name;
        this.bribeTaker = bribeTaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deputy deputy = (Deputy) o;
        return bribeTaker == deputy.bribeTaker &&
                Objects.equals(name, deputy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bribeTaker);
    }

    @Override
    public String toString() {
        return  bribeTaker ? " "+name+" is a corrupt-deputy! " : " "+name+" is an honest deputy. ";

    }
}

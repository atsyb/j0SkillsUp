package home.work4;

import java.util.Objects;

public class Passager {
    private String namePassager;
    private int agePassager;

    public Passager(String namePassager, int agePassager) {
        this.namePassager = namePassager;
        this.agePassager = agePassager;
    }

    public String getNamePassager() {
        return namePassager;
    }

    public void setNamePassager(String namePassager) {
        this.namePassager = namePassager;
    }

    public int getAgePassager() {
        return agePassager;
    }

    public void setAgePassager(int agePassager) {
        this.agePassager = agePassager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passager passager = (Passager) o;
        return agePassager == passager.agePassager &&
                Objects.equals(namePassager, passager.namePassager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePassager, agePassager);
    }

    @Override
    public String toString() {
        return "Passager{" +
                "namePassager='" + namePassager + '\'' +
                ", agePassager=" + agePassager +
                '}';
    }

    public void speaks(){
        System.out.println("Hi!");
    }


}

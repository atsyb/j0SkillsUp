package home.work5.Rada;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Party {
    private List<Deputy> deputyList;

    public Party(List<Deputy> deputyList) {
        this.deputyList = deputyList;
    }

    public List<Deputy> getDeputyList() {
        return deputyList;
    }

    public void setDeputyList(List<Deputy> deputyList) {
        this.deputyList = deputyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Party party = (Party) o;
        return Objects.equals(deputyList, party.deputyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deputyList);
    }

    @Override
    public String toString() {
        String s = "\n";
        for (Deputy d : deputyList) {
            s += d.toString() + "\n";
        }
        return s;
    }
}

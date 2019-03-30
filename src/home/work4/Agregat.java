package home.work4;

public class Agregat {
    private int wight;
    private String type;
    private String countryOfCreate;

    Agregat(int wight, String type, String countryOfCreate) {
        this.wight = wight;
        this.type = type;
        this.countryOfCreate = countryOfCreate;
    }

    public int getWight() {

        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryOfCreate() {
        return countryOfCreate;
    }

    public void setCountryOfCreate(String countryOfCreate) {
        this.countryOfCreate = countryOfCreate;
    }

    public void work() {
        System.out.println("Aggregate is works.");
    }
}

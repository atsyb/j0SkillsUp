package Ekzamen;

public class Employee extends Person {
    private String company;
    public Employee(String name, String company) {
        super(name);
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void displiay() {
        super.displiay();
        System.out.println("Company: "+getCompany());
    }
}

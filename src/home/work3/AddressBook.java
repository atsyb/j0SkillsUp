package home.work3;

import java.util.Objects;

public class AddressBook {
    private String name;
    private String surname;
    private String socialStatus;
    private String phoneNumber;

    public AddressBook(String name, String surname, String socialStatus, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.socialStatus = socialStatus;
        this.phoneNumber = phoneNumber;
    }

    public AddressBook() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(socialStatus, that.socialStatus) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, socialStatus, phoneNumber);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

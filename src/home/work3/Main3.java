package home.work3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("__SkillsUp:HomeWork3__\n");

        AddressBook emptyAddressBook = new  AddressBook();
        AddressBook addressBook = new  AddressBook("Vasia","Pupkin","student","+380671234567");
        System.out.println(emptyAddressBook.toString());
        System.out.println(addressBook.toString());

        System.out.println("Name: "+addressBook.getName());
        System.out.println("Surname: "+addressBook.getSurname());
        System.out.println("Social status: "+addressBook.getSocialStatus());
        System.out.println("Phone number: "+addressBook.getPhoneNumber());

        emptyAddressBook.setName("Petia");
        emptyAddressBook.setSurname("Frolov");
        emptyAddressBook.setSocialStatus("tractor driver");
        emptyAddressBook.setPhoneNumber("+30951230000");
        System.out.println("   Empty after filling:");
        System.out.println(emptyAddressBook.toString());





    }
}

import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook contact1 = new AddressBook();
        contact1.setFirstName("Saptarshi");
        contact1.setLastName("Biswas");

        AddressBook contact2 = new AddressBook();
        contact2.setFirstName("Rakib");
        contact2.setLastName("Biswas");

        System.out.println("Arraylist: ");
        ArrayList container1 = new ArrayList<>();
        container1.add(contact1);
        container1.add(contact2);
        System.out.println(container1);

        System.out.println("Vector: ");
        Vector container2 = new Vector<>();
        container2.add(contact1);
        container2.add(contact2);
        System.out.println(container2);

        System.out.println("Stack: ");
        Stack container3 = new Stack<>();
        container3.add(contact1);
        container3.add(contact2);
        System.out.println(container3);

        System.out.println("Queue: ");
        Queue container4 = new LinkedList();
        container4.add(contact1);
        container4.add(contact2);
        System.out.println(container4);
    }
}

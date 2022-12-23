// Single Responsibility Principle (SRP): A class should have only one reason to change.

// Is it following single Responsibility principle?
//  Single Responsibility Principle
// It is storing and retrieving the employee information
// Also at same time it is managing the employee vacation

public class SingleResExample {

    // Instance variables 4
    private String name;
    private String address;
    private String phoneNumber;
    private int vacationDays;


    //  Getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // instance method
    public void requestVacation(int days) {
        vacationDays -= days;
    }

    // instance method
    public void accrueVacation(int days) {
        vacationDays += days;
    }
}
interface RBI {
    void transaction(double amount);
}

class SBI implements RBI {

    @Override
    public void transaction(double amount) {
        System.out.println("Accessing SBI link...\nYour transaction of amount Rs." + amount + " done....");
    }
}

class Axis implements RBI {
    @Override
    public void transaction(double amount) {
        System.out.println("Accessing Axis link...\nYour transaction of amount Rs." + amount + " done....");
    }
}

class UPI {
    private RBI access;

    public UPI(RBI access) {
        this.access = access;
    }

    public void UPITransaction(double amount) {
        access.transaction(amount);
    }
}

public class UPIPayments {
    public static void main(String[] args) {
        UPI payment1 = new UPI(new SBI());
        payment1.UPITransaction(1000.54);

        UPI payment2 = new UPI(new Axis());
        payment2.UPITransaction(1451.554);
    }
}

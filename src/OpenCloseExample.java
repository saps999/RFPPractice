// OPEN / CLOSE Principle:
// Software entities (classes, modules, functions, methods, pkg,etc)
// should be open for extension and closed for modification
// Principle of multiple inheritance we can apply here.


//class PaymentService {
//
//    // this code was before modification
//    public void makePayment(double amount, String paymentType) {
//        if (paymentType.equals("credit card")) {
//            // code to process a payment with a credit card
//        } else if (paymentType.equals("PayPal")) {
//            // code to process a payment with PayPal
//        }
//
//        //  is added after modiffication
//
//        else if (paymentType.equals("Bitcoin")) {
//            // code to process a payment with Bitcoin // modification of method
//        }
//
//        // Later, if we want to add support for a new payment processor
//        // (such as Bitcoin), we have to modify the PaymentService class
//
//    }
//}




/// Code that follow OPEN close principle





interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paying through CreditCard");
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paying through PayPal");
    }
}

class BitcoinProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paying through BitCoin");
    }
}

class UPI1 implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paying through UPI");
    }
}


class PaymentService {
    private PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void makePayment(double amount) {
        processor.processPayment(amount);
    }
}


public class OpenCloseExample {
    public static void main(String[] args) {

//    PaymentService service = new PaymentService();
        //  service.makePayment(100.00, "credit card");


        // Example usage
        PaymentService service = new PaymentService(new CreditCardProcessor());
        service.makePayment(100.00);

        // Later, we can easily add support for a new payment processor without changing the PaymentService class
        PaymentService service2 = new PaymentService(new BitcoinProcessor());
        service2.makePayment(100.00);
    }
}
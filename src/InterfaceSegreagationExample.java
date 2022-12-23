// Interface Segregation Principle (ISP):
// Clients should not be forced to depend on interfaces they do not use.




//interface Printer {
//    void print();
//    void scan();
//    void copy();
//}
//
//class SimplePrinter implements Printer {
//    public void print() {
//        // code to print
//    }
//
//    public void scan() {
//        // code to scan
//    }
//
//    public void copy() {
//        // code to copy
//    }
//}

// This violates the Interface Segregation Principle
// because the client (in this case, the code calling the print() method)
// is forced to depend on the scan() and copy() methods,
// even though they are not being used.


// ====================== Interface segregation==============================

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Copier {
    void copy();
}

interface MultifunctionDevice extends Printer, Scanner, Copier {
}

class SimplePrinter implements Printer {
    public void print() {
        // code to print
    }
}

class SimpleScanner implements Scanner {
    public void scan() {
        // code to scan
    }
}

class SimpleCopier implements Copier {
    public void copy() {
        // code to copy
    }
}

class MultifunctionPrinter implements MultifunctionDevice {
    private Printer printer;
    private Scanner scanner;
    private Copier copier;

    public MultifunctionPrinter(Printer printer, Scanner scanner, Copier copier) {
        this.printer = printer;
        this.scanner = scanner;
        this.copier = copier;
    }

    public void print() {
        printer.print();
    }

    public void scan() {
        scanner.scan();
    }

    public void copy() {
        copier.copy();
    }
}






// Main class where we are creating object
public class InterfaceSegreagationExample {
    public static void main(String[] args) {


        // Non iterface seggreated class calling.
        // Example usage
        SimplePrinter printer = new SimplePrinter();
        printer.print();

        SimpleCopier copier = new SimpleCopier();
        copier.copy();
        // =======================interface segregation=====================

        // Example usage
        MultifunctionPrinter printer1 = new MultifunctionPrinter(new SimplePrinter(), new SimpleScanner(), new SimpleCopier());
        printer1.print();
        printer1.scan();
        printer1.copy();

    }
}

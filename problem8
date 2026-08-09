interface Returnable {
    double returnItem(int daysLate) throws InvalidDaysException;
}

class InvalidDaysException extends Exception {
    InvalidDaysException(String message) {
        super(message);
    }
}

abstract class LibraryItem implements Returnable {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract double finePerDay();

    public double returnItem(int daysLate)
            throws InvalidDaysException {

        if (daysLate < 0)
            throw new InvalidDaysException("Days late cannot be negative");

        return finePerDay() * daysLate;
    }
}

class Book extends LibraryItem {

    Book(String title) {
        super(title);
    }

    double finePerDay() {
        return 5.0;
    }
}

class DVD extends LibraryItem {

    DVD(String title) {
        super(title);
    }

    double finePerDay() {
        return 10.0;
    }
}

public class Main {
    public static void main(String[] args) {

        Book b = new Book("Java Book");
        DVD d = new DVD("Java DVD");

        try {
            System.out.println("Book Fine: " + b.returnItem(3));
            System.out.println("DVD Fine: " + d.returnItem(2));
        }
        catch (InvalidDaysException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

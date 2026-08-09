import java.util.*;

class InvalidHoursException extends Exception {
    InvalidHoursException(String msg) {
        super(msg);
    }
}

interface Payable {
    double calculateSalary(int hoursWorked, double rate)
        throws InvalidHoursException;
}

class RegularEmployee implements Payable {
    public double calculateSalary(int hoursWorked, double rate)
        throws InvalidHoursException {

        if (hoursWorked < 0)
            throw new InvalidHoursException("Hours worked cannot be negative");

        return hoursWorked * rate;
    }
}

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        double rate = sc.nextDouble();

        RegularEmployee e = new RegularEmployee();

        try {
            double salary = e.calculateSalary(hours, rate);
            System.out.printf("Salary: %.2f", salary);
        } catch (InvalidHoursException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidIncomeException extends Exception {
    public InvalidIncomeException(String message) {
        super(message);
    }
}

public class TaxCalculator {

    private double income;

    public TaxCalculator(double income) throws InvalidIncomeException {
        if (income < 0) {
            throw new InvalidIncomeException("Income cannot be negative!");
        }
        this.income = income;
    }

    public double calculateTax() {
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your annual income (in ₹): ");
            double income = sc.nextDouble();

            TaxCalculator tc = new TaxCalculator(income);
            double tax = tc.calculateTax();
            System.out.println("Calculated tax: ₹" + tax);

        } catch (InputMismatchException e) {
            System.out.println(" Invalid input! Please enter a numeric value.");
        } catch (InvalidIncomeException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Something went wrong: " + e);
        } finally {
            System.out.println(" Tax calculation completed.");
            sc.close();
        }
    }
}

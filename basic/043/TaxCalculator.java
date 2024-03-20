/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.20 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class TaxCalculator {

    /**
     * Calculates the yearly taxes based on the given salary and tax percentage.
     *
     * @param yearlySalary  The yearly salary.
     * @param percentage    The tax percentage.
     * @return              The yearly taxes.
     */
    public static double yearlyTaxes(double yearlySalary, double percentage) {
        return yearlySalary * (percentage / 100.0);
    }

    /**
     * Demonstrates the yearlyTaxes method.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double yearlySalary = 50000.0;
        double percentage = 20.0;
        double taxes = yearlyTaxes(yearlySalary, percentage);
        System.out.println("The yearly taxes for a salary of " + yearlySalary + " with a tax rate of " + percentage + "% is " + taxes);
    }
}

/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.13 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class CalculateTaxes {

    /**
     * Calculates the regular income.
     *
     * <p>Subtracts the stock earnings from the total earnings.
     *
     * @param  totalEarnings  The total earnings.
     * @param  stockEarnings   The stock earnings.
     * @return                 The regular income.
     */
    public double regularIncome(double totalEarnings, double stockEarnings) {
        return totalEarnings - stockEarnings;
    }

    /**
     * Calculates the regular income tax.
     *
     * <p>Multiplies the regular income by the nominal tax rate.
     *
     * @param  regularIncome   The regular income.
     * @param  nominalTaxRate  The nominal tax rate.
     * @return                 The regular income tax.
     */
    public double regularIncomeTax(double regularIncome, double nominalTaxRate) {
        return Double.parseDouble(String.format("%.2f", regularIncome * nominalTaxRate));
    }

    /**
     * Calculates the stock income tax.
     *
     * <p>Multiplies the stock earnings by the stock tax rate.
     *
     * @param  stockEarnings  The stock earnings.
     * @param  stockTaxRate   The stock tax rate.
     * @return                The stock income tax.
     */
    public double stockIncomeTax(double stockEarnings, double stockTaxRate) {
        return Double.parseDouble(String.format("%.2f", stockEarnings * stockTaxRate));
    }

    /**
     * Calculates the total tax.
     *
     * <p>Adds the regular income tax and the stock income tax.
     *
     * @param  regularIncomeTax  The regular income tax.
     * @param  stockIncomeTax    The stock income tax.
     * @return                   The total tax.
     */
    public double totalTax(double regularIncomeTax, double stockIncomeTax) {
        return regularIncomeTax + stockIncomeTax;
    }

    /**
     * Implements exercise 1.7.
     *
     * Demonstrates the regularIncome, regularIncomeTax, stockIncomeTax, and totalTax methods.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double totalEarnings = 134000;
        double stockEarnings = 23000;
        double nominalTaxRate = 27.3 / 100;
        double stockTaxRate = 21 / 100;

        CalculateTaxes tax = new CalculateTaxes();

        double regularIncome = tax.regularIncome(totalEarnings, stockEarnings);
        double regularIncomeTax = tax.regularIncomeTax(regularIncome, nominalTaxRate);
        double stockIncomeTax = tax.stockIncomeTax(stockEarnings, stockTaxRate);
        double totalTax = tax.totalTax(regularIncomeTax, stockIncomeTax);

        System.out.println("All income    : " + totalEarnings);
        System.out.println("Work earnings : " + regularIncome);
        System.out.println("Stock earnings: " + stockEarnings);
        System.out.println();
        System.out.println("Taxes total   : " + totalTax);
        System.out.println("Net income    : " + (totalEarnings - totalTax));
    }
}

// End of file

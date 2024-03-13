/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.12 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class CalculateGrade {

    /**
     * Calculates the total ECTS of a student.
     *
     * @param  exam          The ECTS of the exam.
     * @param  design        The ECTS of the design project.
     * @param  implementation The ECTS of the implementation project.
     * @return               The total ECTS of the student.
     */
    public int calculateTotalECTS( int examECTS, int designECTS, int implementationECTS){
        return examECTS + designECTS + implementationECTS;

    }

    /**
     * Calculates the average grade of a student.
     *
     * @param  examGrade          The grade of the exam.
     * @param  designGrade        The grade of the design project.
     * @param  implementationGrade The grade of the implementation project.
     * @return                    The average grade of the student.
     */
    public double calculateAverageGrade( int examGrade, int designGrade, int implementationGrade){
        int totalParts = 3;
        double average = (examGrade + designGrade + implementationGrade) / (double) totalParts;
        return Double.parseDouble(String.format("%.3f", average));
    }

    /**
     * Implements exercise 1.6.
     *
     * Demonstrates the calculateTotalECTS and calculateAverageGrade methods.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int examECTS = 2;
        int designECTS = 1;
        int implementationECTS = 3;

        int examGrade = 2;
        int designGrade = 4;
        int implementationGrade = 4;



        CalculateGrade calculateGrade = new CalculateGrade();

        int totalECTS = calculateGrade.calculateTotalECTS(examECTS, designECTS, implementationECTS);
        double averageGrade = calculateGrade.calculateAverageGrade(examGrade, designGrade, implementationGrade);

        System.out.println("                ECTS   Grade");
        System.out.println("-----------------------------");
        System.out.println("Exam            " + examECTS + "     " + examGrade);
        System.out.println("Design          " + designECTS + "     " + designGrade);
        System.out.println("Implementation  " + implementationECTS + "     " + implementationGrade);
        System.out.println("-----------------------------");
        System.out.println("Totals          " + totalECTS + "     " + averageGrade + " (Final grade)");
    }
}

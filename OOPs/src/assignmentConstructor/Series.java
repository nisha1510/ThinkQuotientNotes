package assignmentConstructor;
/*
Design a class to overload a function series() as follows:
(i) double series(double n) with one double argument and returns the sum of the series, 
	sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
(ii) double series(double a, double n) with two double arguments and returns 
	the sum of the series, sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.
*/
public class Series {

    double series(double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    double series(double a, double n) {
        double sum = 0.0;
        double power = 2.0; // Initial power
        for (int i = 1; i <= n; i++) {
            sum += i / Math.pow(a, power);
            power += 3; // Increment power by 3 for each term
        }
        return sum;
    }

    public static void main(String[] args) {
    	Series calculator = new Series();

        double sum1 = calculator.series(5); 
        System.out.println("Sum of series  = " + sum1);

        double sum2 = calculator.series(2, 4); 
        System.out.println("Sum of series  = " + sum2);
    }
}

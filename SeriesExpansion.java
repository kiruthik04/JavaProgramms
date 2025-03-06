import java.util.Scanner;

class SeriesExpansion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        int num = input.nextInt();

        double sum = 1; // First term is always 1
        double term;
        int pow_num = 2; // Start the power from x^2
        
        for (int i = 1; i < num; i++) {
            int fact = 1;

            // Calculate factorial of 2*i
            for (int j = 2; j <= i * 2; j++) {
                fact *= j;
            }

            // Calculate the term for x^(2*i) / (2*i)! with alternating signs
            term = Math.pow(x, pow_num) / fact;

            if (i % 2 != 0) {
                term *= -1; // Odd terms are negative
            }

            pow_num += 2; // Increase power by 2 for the next term

            // Add the term to the sum
            sum += term;

            // Print term and sum for debugging
            System.out.printf("Term %d: %.2f, Sum: %.2f\n", i + 1, term, sum);
        }

        // Final result
        System.out.printf("Final Sum: %.2f\n", sum);
    }
}

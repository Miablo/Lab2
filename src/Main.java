import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mio Diaz, Cody Walker
 * @version 1.0
 *
 */
public class Main {

    static Random rand = new Random();
    static ArrayList x = new ArrayList();
    static Root root = new Root();
    static DecimalFormat decFor = new DecimalFormat("#0.00000");
    static int i = 0;
    static int rootFound = 0;
    static int min = 0;
    static int max = 100;

    /**
     *  Main Method
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // for Cody's PSU ID
        root.setNumbers(9,5,5,0,7,4,1);
        int j = 0;
        do {
            i = 0;
            x.add((double) rand.nextDouble() * (max - min +1) + min);
            do {
                x.add(root.doMath((Double) x.get(i)));
                i++;
            } while (i < 2000 || decFor.format((double) x.get(i - 1)) == decFor.format((double) x.get(i) + 0.00001));

            System.out.println("For Cody x0 = " + decFor.format(x.get(0)));
            if (decFor.format((double) x.get(i - 1)) == decFor.format((double) x.get(i) + 0.00001)) {
                System.out.println("Iterations: x" + x.size() + " The number is" + decFor.format((double) x.get(i)));
                rootFound++;
            } else {
                System.out.println("Not Found as the final solution");
            }
            x.clear();
            j++;
        }while(j<2000);
        System.out.println("Number of root Found for Cody: " + rootFound);
    }
    /**
     * mio add you psu Id to setNumbers and un comment everything
     * root.setNumbers(9,5,5,0,7,4,1);
     *         int j = 0;
     *         do {
     *             i = 0;
     *             x.add((double) rand.nextDouble() * (max - min +1) + min);
     *             do {
     *                 x.add(root.doMath((Double) x.get(i)));
     *                 i++;
     *             } while (i < 2000 || decFor.format((double) x.get(i - 1)) == decFor.format((double) x.get(i) + 0.00001));
     *
     *             System.out.println("For Cody x0 = " + decFor.format(x.get(0)));
     *             if (decFor.format((double) x.get(i - 1)) == decFor.format((double) x.get(i) + 0.00001)) {
     *                 System.out.println("Iterations: x" + x.size() + " The number is" + decFor.format((double) x.get(i)));
     *                 rootFound++;
     *             } else {
     *                 System.out.println("Not Found as the final solution");
     *             }
     *             x.clear();
     *             j++;
     *         }while(j<2000);
     *         System.out.println("Number of root Found for Cody: " + rootFound);
     *     }
     */
}

/*
(4 pts) Implement a Java program that applies the Newton-Raphson's method xn+1 = xn – f(xn) / f '(xn)
to search the roots for this polynomial function ax6 – bx5 + cx4 – dx3+ ex2 – fx + g = 0. Fill out a, b, c, d, e, f, and g
using the first 7 digits of your PSU ID, respectively. For example, if PSU ID is 987654321,
the polynomial function would be 9x6 – 8x5 + 7x4 – 6x3+ 5x2 – 4x + 3 = 0.

The program terminates when the difference between the new solution
and the previous one is smaller than 0.00001 within 2000 iterations. Otherwise, it shows Not Found as the final solution.

Your team’s goal is to find as many roots as possible. For the Newton-Raphson’s method, you will need to start with a guessed x0
value which can be randomly generated. List out each guessed x0 value, the derived root, the number of iteration for finding the root,
and the value of the polynomial function by plugging in the root.
 */
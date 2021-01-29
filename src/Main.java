/**
 *
 * @author Mio Diaz,
 * @version 1.0
 *
 */
public class Main {

    /**
     *  Main Method
     *
     * @param args not used
     */
    public static void main(String[] args) {

    }
}

/*
(4 pts) Implement a Java program that applies the Newton-Raphson's method xn+1 = xn – f(xn) / f '(xn)
to search the roots for this polynomial function ax6 – bx5 + cx4 – dx3+ ex2 – fx + g = 0. Fill out a, b, c, d, e, f, and g
using the first 7 digits of your PSU ID, respectively. For example, if PSU ID is 987654321,
the polynomial function would be 9x6 – 8x5 + 7x4 – 6x3+ 5x2 – 4x + 3 = 0. The program terminates when the difference between the new solution
and the previous one is smaller than 0.00001 within 2000 iterations. Otherwise, it shows Not Found as the final solution.

Your team’s goal is to find as many roots as possible. For the Newton-Raphson’s method, you will need to start with a guessed x0
value which can be randomly generated. List out each guessed x0 value, the derived root, the number of iteration for finding the root,
and the value of the polynomial function by plugging in the root.
 */
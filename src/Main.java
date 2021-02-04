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
    static ArrayList roots = new ArrayList();
    static Root root = new Root();
    static DecimalFormat decFor = new DecimalFormat("#0.00000"); // set the format for decimal values to br printed and compared
    static int i = 0;
    static int rootFound = 0; // lets the final number of roots be found
    static int min = 0; //lets there be a min double for random
    static int max = 100; //lets there be a max double for random

    /**
     * Main Method
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // for Cody's PSU ID
        root.setNumbers(9,5,5,0,7,4,1);
        //root.setNumbers(0,1,0,0,0,0,1); //for test propose
        double a, b;
        int j = 0;
        do { // will try 10 random number guess with first loop
            int end = 0;
            i = 0;
            x.add(rand.nextDouble() * (max - min + 1) + min);
            do { // 2nd loop to take guess to x1999 or if root is found or until solution is found
                x.add(root.doMath((Double) x.get(i)));
                i++;
                a = (double) x.get(i);
                b = (double) x.get(i - 1);
                if (a <= b + 0.00001 && a >= b - 0.00001) {
                    end = -1;
                }
                if(i == 1999){
                    end = -1;
                }
            } while (end != -1);
            if(a <= b + 0.00001 && a >= b - 0.00001) {
                if (roots.size() == 0) {
                    roots.add(a);
                } else {
                    for (int p = 0; p < roots.size(); p++) {
                        double check = (double) roots.get(p);
                        if (check != a) {
                            roots.add(a);
                        }
                    }
                }
            }
            j++;
        }while(j < 1999);

        if (roots.size() > 0) { //prints out all the roots that were found
            System.out.print("For Cody PSU Id the root equals = ");
            for(int p = 0; p < roots.size() ; p++){
                System.out.print(decFor.format(roots.get(p)) + " ");
            }
            //System.out.println("Not Found as the final solution");
        } else { //prints out root not found
            System.out.println("Not Found as the final solution");
        }
    }
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
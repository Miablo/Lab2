import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Main method used as program driver
 * used Root class to determine if a random number
 * is a root for the specific polynomial
 *
 * @author Mio Diaz, Cody Walker
 * @version 1.0
 *
 */
public class Main {

    static Random rand = new Random();
    static ArrayList<Double> x = new ArrayList();
    static ArrayList<Double> roots = new ArrayList();
    static Root root = new Root();
    static DecimalFormat decFor = new DecimalFormat("#0.00000"); // set the format for decimal values to br printed and compared
    static int i = 0; // used in do while loop in main method
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
        //root.setNumbers(1,0,0,0,0,0,-1); //for test propose
        double a, b;
        int j = 0;
        do { // will try 10 random number guess with first loop
            int end = 0; // reset end of loop2
            i = 0; // reset loop counter
            x.add(rand.nextDouble() * (max - min + 1) + min); //gets random double between min and max and adds it as x0
            do { // 2nd loop to take guess to x1999 or if root is found or until solution is found
                x.add(root.doMath((Double) x.get(i))); //adds new value to xi
                i++;
                a = (double) x.get(i);
                b = (double) x.get(i - 1);
                if (a <= b + 0.00001 && a >= b - 0.00001) { //checks if root is found
                    end = -1;
                    if (roots.size() == 0) { //add root if no roots already found
                        roots.add(a);
                    } else {
                        for (int p = 0; p < roots.size(); p++) { // check new roots against old and add if no match
                            double check = (double) roots.get(p);
                            if (check != a) {
                                roots.add(a);
                            }
                        }
                    }
                }
                if(i == 1999){ // check if loop reach max counter
                    end = -1;
                }
            } while (end != -1); // end of 2nd loop
            j++;
        }while(j < 1999); // end of 1st loop

        if (roots.size() > 0) { //prints out all the roots that were found
            System.out.print("Found roots: ");
            for (Object o : roots) {
                System.out.print(decFor.format(o) + " ");
            }
        } else { //prints out root not found if no roots were found
            System.out.println("No roots found");
        }
    }
}
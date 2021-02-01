import java.util.Random;

/**
 *
 * @author Mio Diaz,
 * @version 1.0
 *
 */
public class Root {
    // Newton-Raphson's method xn+1 = xn – f(xn) / f '(xn)
    int x_0 = randX();
    int x_next, x_prev;





    // start with a guessed x0
    //value which can be randomly generated.
    /**
     * Random number generator for initial x value
     *
     * @return random value for x_0
     */
    public int randX(){
        Random rand = new Random();
        return rand.nextInt();
    }

    /**
     * Boolean returns true if root is found else false
     *
     * @return true if root found; false if not
     */
    public boolean isRoot() {
        return false;
    }

}

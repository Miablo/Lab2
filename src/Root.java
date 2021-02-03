

/**
 *
 * @author Mio Diaz, Cody Walker
 * @version 1.0
 *
 */
public class Root {
    private double a, b, c, d, e, f, g, x;

    /**
     *
     * @param a sets a from main
     * @param b sets b from main
     * @param c sets c from main
     * @param d sets d from main
     * @param e sets e from main
     * @param f sets f from main
     * @param g sets g from main
     */
    public void setNumbers(double a, double b, double c,
                           double d, double e, double f, double g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }


    /**
     *
     * @param x set x from doMath() for the equation
     */
    private void setX(double x){
        this.x = x;
    }

    /**
     *
     * @return equation with x given to doMath()
     */
    private double equation(){
        return (a * Math.pow(this.x, 6))-(b * Math.pow(this.x, 5)) +
                (this.c * Math.pow(this.x, 4))
                - (this.d * Math.pow(this.x, 3))
                + (this.e * Math.pow(this.x, 2))
                - (this.f * this.x) + this.g;
    }

    /**
     *
     * @return derivative of the equation with x given to doMath()
     */
    private double firstDerivative(){
        return ((a * 6) * Math.pow(this.x, 5))
                - ((b * 5) * Math.pow(this.x, 4))
                + ((this.c * 4) * Math.pow(this.x, 3))
                - ((this.d * 3) * Math.pow(this.x, 2))
                + ((this.e * 2) * this.x)
                - this.f;
    }

    /**
     *
     * @param x the x to pass to setX for the formula
     * @return returns x_n+1 back to main
     */
    public double doMath(double x){
        setX(x);
        return this.x - (equation()/ firstDerivative());
    }
}

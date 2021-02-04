/**
 *
 * Roots class houses all the methods required
 * to determine the roots of a polynomial equation
 *
 * @author Mio Diaz, Cody Walker
 * @version 1.0
 *
 */
public class Root {
    private double a, b, c, d, e, f, g, x;

    /**
     * Sets values for coefficients of polynomial
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
     * Method used to set the value of x
     *
     * @param x set x from doMath() for the equation
     */
    private void setX(double x){
        this.x = x;
    }

    /**
     * Method creates and fills in values for
     * the polynomial function:
     * ax6 – bx5 + cx4 – dx3+ ex2 – fx + g = 0
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
     * Method used to create the derivative of the polynomial F'(x)
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
     * Method is used to return the value of x_1
     *
     * @param x the x to pass to setX for the formula
     * @return returns x_n+1 back to main
     */
    public double doMath(double x){
        setX(x);
        if (this.x == 0){ // if x is 0 the equation will equal 0 so just return 0
            return 0;
        }else {
            return this.x - (equation() / firstDerivative());
        }
    }
}

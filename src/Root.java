import java.util.Random;

/**
 *
 * @author Mio Diaz,
 * @version 1.0
 *
 */
public class Root {
    private double a, b, c, d, e, f, g, x;
    private double equ;

    public void setNumbers(double a, double b, double c, double d, double e, double f, double g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }

    private void setX(double x){
        this.x = x;
    }

    private double equation(){
        return (a * Math.pow(this.x, 6))-(b * Math.pow(this.x, 5)) +
                (this.c * Math.pow(this.x, 4)) - (this.d * Math.pow(this.x, 3)) + (this.e * Math.pow(this.x, 2)) -
                (this.f * this.x) + this.g;
    }

    private double firstDrivative(){
        return ((a * 6) * Math.pow(this.x, 5))-((b * 5) * Math.pow(this.x, 4)) +
                ((this.c * 4) * Math.pow(this.x, 3)) - ((this.d * 3) * Math.pow(this.x, 2)) + ((this.e * 2) * this.x) -
                this.f;
    }
}

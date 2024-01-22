public class ComplexNumber {
    private double re;
    private double im;
    private static final int minValue = 1;
    public static final int maxValue = 50;


    // Constructor
    public ComplexNumber(double r, double i){
        re = r;
        im = i;
    }


    // Re
    public double re(){
        return this.re;
    }


    // Im
    public double im(){
        return this.im;
    }


    // Print
    public void print(){
        if(this.im >= 0){
            System.out.print(this.re + "+" + this.im+"i");
        }
        else{
            System.out.print(this.re + "" + this.im+"i");
        }

    }


    // Plus
    public ComplexNumber plus(ComplexNumber b){
        ComplexNumber a = this;
        double real = a.re + b.re;
        double im = a.im + b.im;
        return new ComplexNumber(real, im);
    }


    // Minus
    public ComplexNumber minus(ComplexNumber b){
        ComplexNumber a = this;
        double real = a.re - b.re;
        double im = a.im - b.im;
        return new ComplexNumber(real, im);
    }


    // Static plus
    public static ComplexNumber Plus(ComplexNumber a, ComplexNumber b){
        double re = a.re + b.re;
        double im = a.im + b.im;
        return new ComplexNumber(re, im);
    }


    // Multiple
    public static ComplexNumber Mul(ComplexNumber a,ComplexNumber b){
        return new ComplexNumber((a.re * b.re - a.im * b.im), (a.re * b.im + a.im * b.re));
    }
}

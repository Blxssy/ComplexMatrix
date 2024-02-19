public class ComplexNumber {
    private double re;
    private double im;

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
            System.out.print(Math.round(re) + "+" + Math.round(im)+"i");
        }
        else{
            System.out.print(Math.round(re) + "" + Math.round(im)+"i");
        }

    }

    // Minus
    public ComplexNumber minus(ComplexNumber b){
        ComplexNumber a = this;
        double real = a.re - b.re;
        double im = a.im - b.im;
        return new ComplexNumber(real, im);
    }


    // Plus
    public static ComplexNumber Plus(ComplexNumber a, ComplexNumber b){
        ComplexNumber res = new ComplexNumber(0, 0);
        res.re = a.re + b.re;
        res.im = a.im + b.im;
        return res;
    }


    // Multiple
    public static ComplexNumber Mul(ComplexNumber a,ComplexNumber b){
        return new ComplexNumber((a.re * b.re - a.im * b.im), (a.re * b.im + a.im * b.re));
    }
}

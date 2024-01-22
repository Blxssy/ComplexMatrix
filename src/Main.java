public class Main {
    public static void main(String[] args) {
        ComplexMatrix a = new ComplexMatrix();
        a.matrix[0][0] = new ComplexNumber(1,1);
        a.matrix[0][1] = new ComplexNumber(2,2);
        a.matrix[1][0] = new ComplexNumber(3,3);
        a.matrix[1][1] = new ComplexNumber(4,4);

        ComplexMatrix b = new ComplexMatrix();
        b.matrix[0][0] = new ComplexNumber(-1,-1);
        b.matrix[0][1] = new ComplexNumber(-2,-2);
        b.matrix[1][0] = new ComplexNumber(-3,-3);
        b.matrix[1][1] = new ComplexNumber(-4,-4);

        var res = ComplexMatrix.Mul(a, b);

        var expected = new ComplexMatrix();
        expected.matrix[0][0] = new ComplexNumber(0, -14);
        expected.matrix[0][1] = new ComplexNumber(0, -20);
        expected.matrix[1][0] = new ComplexNumber(0, -30);
        expected.matrix[1][1] = new ComplexNumber(0, -44);

        if(res.matrix[0][0].im() == expected.matrix[0][0].im() && res.matrix[0][1].im() == expected.matrix[0][1].im() && res.matrix[1][0].im() == expected.matrix[1][0].im() && res.matrix[1][1].im() == expected.matrix[1][1].im()
        && res.matrix[0][0].re() == expected.matrix[0][0].re() && res.matrix[0][1].re() == expected.matrix[0][1].re() && res.matrix[1][0].re() == expected.matrix[1][0].re() && res.matrix[1][1].re() == expected.matrix[1][1].re()){
            System.out.println("OK");
        }
        else {
            System.out.println("FAIL");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Test
        {
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

            ComplexMatrix res = new ComplexMatrix();
            res.matrix = ComplexMatrix.Mul(a, b);

            var expected = new ComplexMatrix();
            expected.matrix[0][0] = new ComplexNumber(0, -14);
            expected.matrix[0][1] = new ComplexNumber(0, -20);
            expected.matrix[1][0] = new ComplexNumber(0, -30);
            expected.matrix[1][1] = new ComplexNumber(0, -44);

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if(res.matrix[i][j].re() != expected.matrix[i][j].re() || res.matrix[i][j].im() != expected.matrix[i][j].im()){
                        System.out.println("FAIL");
                        return;
                    }
                }
            }
            System.out.println("OK");
        }

        {
            ComplexMatrix a = new ComplexMatrix();
            ComplexMatrix b = new ComplexMatrix();

            ComplexMatrix res = new ComplexMatrix();
            res.matrix = ComplexMatrix.Mul(a, b);

            res.Print();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Test
//        {
//            ComplexMatrix a = new ComplexMatrix();
//            a.matrix[0][0] = new ComplexNumber(1,1);
//            a.matrix[0][1] = new ComplexNumber(2,2);
//            a.matrix[1][0] = new ComplexNumber(3,3);
//            a.matrix[1][1] = new ComplexNumber(4,4);
//
//            ComplexMatrix b = new ComplexMatrix();
//            b.matrix[0][0] = new ComplexNumber(-1,-1);
//            b.matrix[0][1] = new ComplexNumber(-2,-2);
//            b.matrix[1][0] = new ComplexNumber(-3,-3);
//            b.matrix[1][1] = new ComplexNumber(-4,-4);
//
//            ComplexMatrix res = new ComplexMatrix();
//            res.matrix = ComplexMatrix.Mul(a, b);
//
//            var expected = new ComplexMatrix();
//            expected.matrix[0][0] = new ComplexNumber(0, -14);
//            expected.matrix[0][1] = new ComplexNumber(0, -20);
//            expected.matrix[1][0] = new ComplexNumber(0, -30);
//            expected.matrix[1][1] = new ComplexNumber(0, -44);
//
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    if(res.matrix[i][j].re() != expected.matrix[i][j].re() || res.matrix[i][j].im() != expected.matrix[i][j].im()){
//                        System.out.println("FAIL");
//                        return;
//                    }
//                }
//            }
//            System.out.println("OK");
//        }


        {
            ComplexMatrix a = new ComplexMatrix(2, 2);
            ComplexMatrix b = new ComplexMatrix(2, 2);
            ComplexMatrix t = new ComplexMatrix(2, 2);
            t.matrix = a.matrix;
            System.out.println("Первая матрица");
            a.Print();
            System.out.println("Вторая матрица");
            b.Print();

            ComplexMatrix res;
            System.out.println("Сумма матриц");
            res = ComplexMatrix.Plus(b, a);
            res.Print();
            System.out.println("Транспонированная первая матрица");
            t = ComplexMatrix.T(t);
            t.Print();
            System.out.println("Произведение матриц");
            res.matrix = ComplexMatrix.Mul(a, b);
            res.Print();
        }
    }
}
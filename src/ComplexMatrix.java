

public class ComplexMatrix {
    ComplexNumber[][] matrix;
    public int h = 0;
    public int w = 0;


    // Constructor
    public ComplexMatrix(int he, int wi){
        h = he;
        w = wi;
        matrix = new ComplexNumber[h][w];
        for (int i = 0; i < h; i++) {
            matrix[i] = new ComplexNumber[w];
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                double re = Math.round(Math.random() * 5);
                double im = Math.round(Math.random() * 5);

                if (matrix != null) {
                    matrix[i][j] = new ComplexNumber(re, im);
                }
            }
        }
    }

    public int GetHeight(){
        return h;
    }


    // Print
    public void Print(){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j].print();
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // PLus
    public static ComplexMatrix Plus(ComplexMatrix a, ComplexMatrix b){
        ComplexMatrix res = new ComplexMatrix(a.h, a.w);
        for (int i = 0; i < a.h; i++) {
            for (int j = 0; j < a.w; j++) {
                res.matrix[i][j] = ComplexNumber.Plus(a.matrix[i][j], b.matrix[i][j]);
            }
        }

        return res;
    }


    // T
    public static ComplexMatrix T(ComplexMatrix a){
        ComplexMatrix m = new ComplexMatrix(a.h, a.w);

        for (int i = 0; i < a.h; i++) {
            for (int j = 0; j < a.w; j++) {
                m.matrix[i][j] = a.matrix[j][i];
            }
        }

        return m;
    }


    // Multiple
    public static ComplexNumber[][] Mul(ComplexMatrix a, ComplexMatrix b){
        ComplexNumber[][] m = new ComplexNumber[a.h][b.w];
        for (var i = 0; i < a.h; i++) {
            for (var j = 0; j < b.w; j++) {
                m[i][j] = new ComplexNumber(0, 0);
                for (var k = 0; k < a.w; k++) {
                    m[i][j] = ComplexNumber.Plus(m[i][j], ComplexNumber.Mul(a.matrix[i][k], b.matrix[k][j]));
                }
            }
        }

        return m;
    }


    // Determinant
    public static int Det(){
        return 0;
    }
}

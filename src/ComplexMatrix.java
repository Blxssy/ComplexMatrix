public class ComplexMatrix {
    ComplexNumber[][] matrix;

    private static final int minValue = -10;
    private static final int maxValue = 10;
    private static final int h = 2;
    private static final int w = 2;


    // Constructor
    public ComplexMatrix(){
        matrix = new ComplexNumber[h][w];
        for (int i = 0; i < h; i++) {
            matrix[i] = new ComplexNumber[w];
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                double re = minValue + (int) (Math.random() * (maxValue - minValue + 1));
                double im = minValue + (int) (Math.random() * (maxValue - minValue + 1));

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
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a.matrix[i][j] =  a.matrix[i][j].plus(b.matrix[i][j]);
            }
        }

        return a;
    }


    // T
    public static ComplexMatrix T(ComplexMatrix a){
        ComplexNumber[][] m = new ComplexNumber[h][w];
        for (int i = 0; i < h; i++) {
            m[i] = new ComplexNumber[w];
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                m[i][j] = a.matrix[j][i];
            }
        }

        ComplexMatrix n = new ComplexMatrix();
        n.matrix = m;

        return n;
    }


    // Multiple
    public static ComplexNumber[][] Mul(ComplexMatrix a, ComplexMatrix b){
        final var m = new ComplexNumber[a.matrix.length][b.matrix[0].length];
        for (var i = 0; i < m.length; i++) {
            for (var j = 0; j < m[0].length; j++) {
                m[i][j] = new ComplexNumber(0, 0);
                for (var k = 0; k < a.matrix[0].length; k++) {
                    m[i][j] = m[i][j].plus(ComplexNumber.Mul(a.matrix[i][k], b.matrix[k][j]));
                }
            }
        }

        return m;
    }
}

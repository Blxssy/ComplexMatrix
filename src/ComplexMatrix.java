public class ComplexMatrix {
    ComplexNumber[][] matrix;

    private static final int minValue = -5;
    private static final int maxValue = 5;
    private static final int h = 3;
    private static final int w = 3;


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
}

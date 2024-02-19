public class Main {
    public static void main(String[] args) {
        int maxNumber = 10;
        ComplexMatrix a = new ComplexMatrix(2, 2);
        ComplexMatrix b = new ComplexMatrix(2, 2);
        ComplexMatrix t = new ComplexMatrix(a.w, a.h);
        t.matrix = a.matrix;

        System.out.println("Первая матрица");
        a.Print();
        System.out.println("Вторая матрица");
        b.Print();

        ComplexMatrix res;
        if(a.h != b.h || a.w != b.w){
            System.out.println("Невозможно посчитать сумму, тк матрицы имеют разные размеры\n");
        }
        else{
            System.out.println("Сумма матриц");
            res = ComplexMatrix.Plus(b, a);
            res.Print();
        }

        System.out.println("Транспонированная первая матрица");
        t = ComplexMatrix.T(t);
        t.Print();

        ComplexMatrix r = new ComplexMatrix(a.h, b.w);
        if(a.h != b.w){
            System.out.println("Невозможно умножить матрицы, тк количество строк в первой не равно количетсву столбцов во второй\n");
        }
        else{
            System.out.println("Произведение матриц");
            r.matrix = ComplexMatrix.Mul(a, b);
            r.Print();
        }
    }
}
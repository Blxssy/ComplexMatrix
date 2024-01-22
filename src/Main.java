public class Main {
    public static void main(String[] args) {
        ComplexMatrix a = new ComplexMatrix();
        ComplexMatrix b = new ComplexMatrix();
        a.Print();
        b.Print();
        ComplexMatrix c = ComplexMatrix.Plus(a, b);
        c.Print();
    }
}
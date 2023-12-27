public class Triangulo {
    private double l1;
    private double l2;
    private double l3;
    private String desc;

    public void inicializaTriangulo(double lado1, double lado2, double lado3, String descricao) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    public double perimetro() {
        return l1 + l2 + l3;
    }

    public String toString() {
        return "Triangulo [Lado 1=" + l1 + ", Lado 2=" + l2 + ", Lado 3=" + l3 + ", Descricao=" + desc + "]";
    }
}

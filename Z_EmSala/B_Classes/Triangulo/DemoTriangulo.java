public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1,t2;
        t1 = new Triangulo();
        t2 = new Triangulo();
        t1.inicializaTriangulo(2.5,2.5,2.5,"equilatero");
        t2.inicializaTriangulo(2.5,2.5,2.5,"equilatero");
        System.out.println(t1);
    }
}

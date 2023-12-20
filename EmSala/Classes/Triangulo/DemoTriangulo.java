public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1,t2,t3;
        t1 = new Triangulo();
        t2 = new Triangulo();
        t1.inicializaTriangulo(2.5,2.5,2.5,"equilatero");
        t2.inicializaTriangulo(2.5,2.5,2.5,"equilatero");
        t3 = new Triangulo();
        t3 = t1;
        t3.l3 = 2;
        System.out.println(t1.l3);
    }
}

public class DemoDesenho {
    public static void main(String[] args) {
        CirculoG circulo = new CirculoG();
        TrianguloG triangulo = new TrianguloG();
        QuadradoG quadrado = new QuadradoG();
        Desenho desenho1 = new Desenho(circulo, 0, 0, quadrado, 0, 5);
        Desenho desenho2 = new Desenho(quadrado, 5, 0, triangulo, 5, 5);
        desenho1.apresenta();
        System.out.println();
        desenho2.apresenta();
    }
}

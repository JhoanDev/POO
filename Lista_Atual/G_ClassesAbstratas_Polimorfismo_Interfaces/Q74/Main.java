public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Quadrado q = new Quadrado();
        Circulo c = new Circulo();

        Desenho d = new Desenho(c, q, 1, 2, -5, 3);
        Desenho d2 = new Desenho(q, t, 2, 5, -1, 2);

        d.apresenta();
        d2.apresenta();
        
    }
}

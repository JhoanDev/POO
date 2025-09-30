package B_CriacaoDeClasses.Q37;

public class Main {
    public static void main(String args[]) {
        Contador contador1 = new Contador();
        Contador contador2 = new Contador(1);

        contador1.incrementarContador();
        contador2.incrementarContador();

        System.out.println("1 " + contador1);
        System.out.println("2 " + contador2);

        contador2.zerarContador();

        System.out.println("2 " + contador2);
    }
}

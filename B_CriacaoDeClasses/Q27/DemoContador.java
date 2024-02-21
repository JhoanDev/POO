public class DemoContador {
    public static void main(String[] args) {
        Contador contar = new Contador();
        contar.imprimirContagem();

        contar.incrementar();
        contar.imprimirContagem();
        
        contar.incrementar();
        contar.imprimirContagem();

        contar.zerar();
        contar.imprimirContagem();
    }
}
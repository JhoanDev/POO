public class TresGenDemo {

    public static void main(String[] args) {
        TresGen<Integer> exemplo1 = new TresGen<>(1, 1, 1);
        System.out.println("Iguais: " + exemplo1.quantosIguais());
        exemplo1.imprimirAtributos();
        System.out.println();

        TresGen<String> exemplo2 = new TresGen<>("abc", "xyz", "abc");
        System.out.println("Iguais: " + exemplo2.quantosIguais());
        exemplo2.imprimirAtributos();
        System.out.println();

        TresGen<Double> exemplo3 = new TresGen<>(1.5, 2.5, 3.5);
        System.out.println("Iguais: " + exemplo3.quantosIguais());
        exemplo3.imprimirAtributos();
        System.out.println();

        TresGen<Character> exemplo4 = new TresGen<>('c', 'b', 'b');
        System.out.println("Iguais: " + exemplo4.quantosIguais());
        exemplo4.imprimirAtributos();
        System.out.println();

        TresGen<Integer> exemplo5 = new TresGen<>(7, 7, 0);
        System.out.println("Iguais: " + exemplo5.quantosIguais());
        exemplo5.imprimirAtributos();
        System.out.println();
    }
}

public class DemoComparacao {
    public static void main(String[] args) {
        Double d1 = 5.5, d2 = 5.5;
        System.out.println(Comparacao.eIgual(d1, d2));
        Integer i1 = 3, i2 = 4;
        System.out.println(Comparacao.eIgual(i1, i2));
        String s1 = "Brasil", s2 = "Argentina";
        System.out.println(Comparacao.eIgual(s1, s2));
    }

}
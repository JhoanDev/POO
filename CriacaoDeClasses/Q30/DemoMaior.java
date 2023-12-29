public class DemoMaior {
    public static void main(String[] args) {
        int valorInt1 = 10;
        int valorInt2 = 5;
        int resultadoInt1 = Maior.maiorValor(valorInt1, valorInt2);

        int valorInt3 = 8;
        int valorInt4 = 15;
        int valorInt5 = 3;
        int resultadoInt2 = Maior.maiorValor(valorInt3, valorInt4, valorInt5);

        int valorInt6 = 25;
        int valorInt7 = 17;
        int valorInt8 = 10;
        int valorInt9 = 8;
        int resultadoInt3 = Maior.maiorValor(valorInt6, valorInt7, valorInt8, valorInt9);

        int valorInt10 = 5;
        int valorInt11 = 8;
        int valorInt12 = 12;
        int valorInt13 = 3;
        int valorInt14 = 7;
        int resultadoInt4 = Maior.maiorValor(valorInt10, valorInt11, valorInt12, valorInt13, valorInt14);

        System.out.println("Maior valor: " + resultadoInt1 + " (valores: " + valorInt1 + ", " + valorInt2 + ")");
        System.out.println("Maior valor: " + resultadoInt2 + " (valores: " + valorInt3 + ", " + valorInt4 + ", " + valorInt5 + ")");
        System.out.println("Maior valor: " + resultadoInt3 + " (valores: " + valorInt6 + ", " + valorInt7 + ", " + valorInt8 + ", " + valorInt9 + ")");
        System.out.println("Maior valor: " + resultadoInt4 + " (valores: " + valorInt10 + ", " + valorInt11 + ", " + valorInt12 + ", " + valorInt13 + ", " + valorInt14 + ")");

        double valorDouble1 = 5.2;
        double valorDouble2 = 8.7;
        double resultadoDouble1 = Maior.maiorValor(valorDouble1, valorDouble2);

        double valorDouble3 = 15.3;
        double valorDouble4 = 12.8;
        double valorDouble5 = 10.1;
        double resultadoDouble2 = Maior.maiorValor(valorDouble3, valorDouble4, valorDouble5);

        double valorDouble6 = 25.6;
        double valorDouble7 = 17.2;
        double valorDouble8 = 10.8;
        double valorDouble9 = 8.4;
        double resultadoDouble3 = Maior.maiorValor(valorDouble6, valorDouble7, valorDouble8, valorDouble9);

        double valorDouble10 = 5.5;
        double valorDouble11 = 8.1;
        double valorDouble12 = 12.7;
        double valorDouble13 = 3.3;
        double valorDouble14 = 7.9;
        double resultadoDouble4 = Maior.maiorValor(valorDouble10, valorDouble11, valorDouble12, valorDouble13, valorDouble14);

        System.out.println("Maior valor: " + resultadoDouble1 + " (valores: " + valorDouble1 + ", " + valorDouble2 + ")");
        System.out.println("Maior valor: " + resultadoDouble2 + " (valores: " + valorDouble3 + ", " + valorDouble4 + ", " + valorDouble5 + ")");
        System.out.println("Maior valor: " + resultadoDouble3 + " (valores: " + valorDouble6 + ", " + valorDouble7 + ", " + valorDouble8 + ", " + valorDouble9 + ")");
        System.out.println("Maior valor: " + resultadoDouble4 + " (valores: " + valorDouble10 + ", " + valorDouble11 + ", " + valorDouble12 + ", " + valorDouble13 + ", " + valorDouble14 + ")");
    }
}

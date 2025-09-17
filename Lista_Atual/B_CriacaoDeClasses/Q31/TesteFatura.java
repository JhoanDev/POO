package Lista_Atual.B_CriacaoDeClasses.Q31;

public class TesteFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura(123, "Mouse", 2, 150.5);
        Fatura f2 = new Fatura(1234, "Teclados", -1, -150.5);

        System.out.println("total f1: " + f1.calculaTotal());
        System.out.println("total f2: " + f2.calculaTotal());
    }
}

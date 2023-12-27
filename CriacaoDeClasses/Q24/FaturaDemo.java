public class FaturaDemo {
    public static void main(String[] args) {
        Fatura lucas = new Fatura(1, "Headset", 10, 279.89);
        Fatura pedro = new Fatura(2, "Mouse", 17, 139.79);
        System.out.println(lucas);
        System.out.println("Total fatura: " + lucas.calculaTotal());
        System.out.println();
        System.out.println(pedro);
        System.out.println("Total fatura: " + pedro.calculaTotal());
    }
}

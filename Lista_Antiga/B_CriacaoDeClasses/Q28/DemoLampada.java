public class DemoLampada {
    public static void main(String[] args) {
        Lampada lp = new Lampada();
        System.out.println(lp);

        lp.acende();
        lp.mostraEstado();

        lp.apaga();
        lp.apaga();
        lp.acende();
        lp.acende();
        lp.vezesAcesa();

        lp.apaga();
        lp.acende();

        System.out.println(lp);
    }
}
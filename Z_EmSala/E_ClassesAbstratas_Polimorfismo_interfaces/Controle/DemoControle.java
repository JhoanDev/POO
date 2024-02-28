public class DemoControle {
    public static void main(String[] args) {
        Controle control = new Controle();
        Carro carro = new Carro(4, 4, "SC32D3");
        Aviao aviao = new Aviao(72, "ASFDSVX2", "skadgkasg23");
        Barco barco = new Barco(12, 12.4, "BA2DC");

        System.out.println(carro);
        System.out.println(aviao);
        System.out.println(barco);

        control.controlar(aviao);
        control.controlar(barco);
        control.controlar(carro);
    }

}
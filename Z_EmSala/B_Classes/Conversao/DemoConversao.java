public class DemoConversao {
    public static void main(String[] args) {
        double milhas = 100;
        System.out.println(milhas + " milhas são: " + Conversao.milhasParaQuilometros(milhas) + " Quilometros");
        double pes = 100;
        System.out.println(pes + " pes são: " + Conversao.pesParaCentimetros(pes) + " Centimertros");
        double polegadas = 100;
        System.out.println(polegadas + " polegadas são: " + Conversao.polegadasParaCentimetros(polegadas) + " Centimetros");
    }
}
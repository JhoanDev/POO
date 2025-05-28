
public class DemoDados {

    public static void main(String[] args) {

        final long NUMERO_DE_LANCAMENTOS = 36000000;
        Dado dado1 = new Dado(); 
        Dado dado2 = new Dado(); 
        int[] frequenciaSomas = new int[11];

        System.out.println("Iniciando simulação de " + String.format("%d", NUMERO_DE_LANCAMENTOS) + " lançamentos de dois dados...");

        for (int i = 0; i < NUMERO_DE_LANCAMENTOS; i++) {
            int valorDado1 = dado1.lancar();
            int valorDado2 = dado2.lancar();
            int soma = valorDado1 + valorDado2;
            frequenciaSomas[soma-2]++;
        }

        System.out.println("\nResultados da Simulação:");
        System.out.println("-------------------------");
        System.out.println("Soma\tFrequência\tPercentual");
        System.out.println("----\t----------\t----------");

        for (int soma = 0; soma < 11; soma++) {
            double percentual = (double) frequenciaSomas[soma] / NUMERO_DE_LANCAMENTOS  * 100.0;
            System.out.printf("%-4d\t%,-10d\t%.4f%%\n", soma, frequenciaSomas[soma], percentual);
        }
    }
}
import java.util.Random;

public class DemoDados {
    public static void main(String[] args) {
        Random rand = new Random();
        int valores[] = new int[11]; //indice 0 = valor 2, indice 1 = valor 3...
        int i;
        int valor;
        for(i = 0; i<36000000; i++){
            valor = Dados.somaDosDados(rand);
            valores[valor-2]++;
        }
        for (int j = 0; j < valores.length; j++) {
            System.out.println("Vezes em que a soma resultou em " + (j+2) + ": " + valores[j]);
        }
    }
    
}
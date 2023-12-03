import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.print("Insira o numero da carta de 1 (ás) até 13 (rei): ");
        int numero = scan.nextInt();
        if (numero < 1 || numero > 13) {
            System.err.println("Número inválido");
            System.exit(0);
        }
        System.err.print("Insira o naipe (1 = Ouros)(2 = Paus)(3 = Copas)(4 = Espadas): ");
        int naipe = scan.nextInt();
        if (naipe < 1 || naipe > 4) {
            System.err.println("Número inválido");
            System.exit(0);
        }
        System.err.printf("%s de %s\n",nome_carta(numero),naipe_carta(naipe));
        scan.close();
    }

    private static String nome_carta(int numero){
        String nomes[] = {"Ás","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove","Dez","Valete","Dama","Rei"};
        return nomes[numero-1];
    }
    private static String naipe_carta(int naipe){
        String naipes[] = {"Ouros","Paus","Copas","Espadas"};
        return naipes[naipe-1];
    }
}

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.print("Insira os minutos totais: ");
        int mintotal = scan.nextInt();
        int dias = 0;
        int horas = 0;
        int minutos = mintotal;
        int i = 0;
        for(i = minutos; i >= 1440; i -= 1440){
            dias++;
        }
        minutos = i;
        for(i = minutos; i >= 60; i -= 60){
            horas++;
        }
        minutos = i;
        System.out.printf("%d minutos = %d dias, %d horas e %d minutos.\n",mintotal,dias,horas,minutos);
        scan.close();
    }
}

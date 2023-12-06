import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vet[] = new double[3];
        for (int i = 0; i < 3; i++) {
            System.err.printf("Informe o %d° número: ", i+1);
            vet[i] = scan.nextDouble();
        }
        double med = media(vet[0], vet[1], vet[2]);
        System.err.printf("A média dos valores é: %.4g\n", med);
        scan.close();
    }

    public static double media(double n1, double n2, double n3){
        return (n1+n2+n3)/3; 
    }
}

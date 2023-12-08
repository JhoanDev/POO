import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double[] vet = new Double[3];
        for (int i = 0; i < 3; i++){
            System.out.printf("Insira o %d° número: ", i+1);
            vet[i] = scan.nextDouble();
        }
        if (vet[0] <= vet[1] && vet[0] <= vet[2]) {
            System.out.println("O menor número é: "+ vet[0]);
        }
        else if (vet[1] <= vet[0] && vet[1] <= vet[2]) {
            System.out.println("O menor número é: "+ vet[1]);
        }
        else{
            System.out.println("O menor número é: "+ vet[2]);
        }
        scan.close();
    }
}

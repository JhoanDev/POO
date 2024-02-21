import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sair = 0;
        int grau;
        double x;
        while (true) {
            System.out.print("\nCalcular P(x), digite 0 para sair e 1 para continuar: ");
            sair = scan.nextInt();
            System.out.println("");
            if (sair == 0) {
                break;
            }
            System.out.print("Insira o grau do polinomio: ");
            grau = scan.nextInt();
            double a[] = new double[grau + 1];
            int grauaux = grau;
            for (int i = 0; i < a.length; i++) {
                System.out.printf("Insira o termo que multiplica x^%d: ", grauaux--);
                a[i] = scan.nextDouble();
            }
            System.out.print("Insira o valor de X: ");
            x = scan.nextInt();
            System.out.printf("O resultado é: %f", polinomio(x , grau, a));
        }
        scan.close();
    }

    public static double polinomio(double x, int n, double []a){
        if (n == 0) {
            return a[0];
        }
        else{
            return x*polinomio(x, n-1, a) + a[n];
        }
    }
}

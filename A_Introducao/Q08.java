import java.util.Scanner;

public class Q08 {

    public static final int eletros = 222;
    public static final int camamesabanho = 111;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o código do setor: ");
        int codigo = scan.nextInt();
        if (codigo != eletros && codigo != camamesabanho) {
            System.err.println("Setor inválido");
            System.exit(0);
        }
        System.out.print("Insira o valor original do produto: ");
        double valor = scan.nextDouble();
        if (codigo == eletros) {
            if (valor > 500) {
                valor = valor * 0.90;
            }
            System.out.printf("Produto do setor Eletros\nValor com desconto: %gR$\n", valor);
        } else {
            if (valor > 100) {
                valor = valor * 0.60;
            } else if (valor > 50) {
                valor = valor * 0.80;
            } else {
                valor = valor * 0.90;
            }
            System.out.printf("Produto do setor Cama, Mesa, Banho\nValor com desconto: %gR$\n", valor);
        }
        scan.close();
    }
}

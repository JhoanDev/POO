
import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int id, idade;
        String nome, telefone;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Insira o id: ");
            id = Integer.parseInt(scan.nextLine());
            if (id < 0)
                break;
            System.out.print("Insira o nome: ");
            nome = scan.nextLine();
            System.out.print("Insira a idade: ");
            idade = Integer.parseInt(scan.nextLine());
            System.out.print("Insira o telefone: ");
            telefone = scan.nextLine();
            System.out.println();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }
        scan.close();
        System.out.println("\n===== Listando clientes cadastrados =====\n");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
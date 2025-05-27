import java.util.*;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id;
        int idade;
        String nome;
        String telefone;
        ArrayList<Cliente> clientes = new ArrayList<>();
        do {
            System.out.print("Insira o id: ");
            id = scan.nextInt();
            scan.nextLine();
            if (id <= 0) break;
            System.out.print("Insira o idade: ");
            idade = scan.nextInt();
            scan.nextLine();
            System.out.print("Insira o nome: ");
            nome = scan.nextLine();
            System.out.print("Insira o telefone: ");
            telefone = scan.nextLine();
            clientes.add(new Cliente(id, nome, idade, telefone));
        } while (id >= 0);
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        scan.close();
    }

}
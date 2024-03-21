import java.util.Scanner;
import java.util.Stack;


public class Pilha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        Stack <Character> pilha = new Stack<>();
        for (int i = 0; i < entrada.length(); i++) 
            pilha.push(entrada.charAt(i));
        int fecha = 0;
        char parentese;
        boolean balanceada = true;
        while (!pilha.isEmpty()) {
            parentese = pilha.pop();
            if (parentese == ')') 
                fecha++;
            else if(fecha > 0)
                fecha--;
            
            else{
                balanceada = false;
                break;
            }
        }
        if (fecha != 0) {
            balanceada = false;
        }
        System.out.println(balanceada?"Esta balanceada":"Nao esta balanceada");
        scan.close();
    }
}

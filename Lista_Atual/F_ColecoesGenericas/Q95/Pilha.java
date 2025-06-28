package Lista_Atual.F_ColecoesGenericas.Q95;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public static boolean verifica(String entrada){
        Stack<Character> pilha = new Stack<>();
        Character parentese;
        for (int i = 0; i < entrada.length(); i++) {
            parentese = entrada.charAt(i);

            if (parentese == '(') {
                pilha.push(parentese);
            }
            else if (pilha.empty()) {
                return false;
            }
            else{
                pilha.pop();
            }
        }
        if (!pilha.empty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String entrada;
        Scanner scan = new Scanner(System.in);
        entrada = scan.nextLine();

        String saida = verifica(entrada)?"Está balanceada":"Não está balanceada";
        System.out.println(saida);

        scan.close();
    }
}

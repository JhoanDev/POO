package Lista_Atual.F_ColecoesGenericas.Q93;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList <Character> letras = new LinkedList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J'));
        LinkedList <Character> invertidas = new LinkedList<>();
        for (int i = letras.size()-1; i >= 0; i--) {
            invertidas.add(letras.get(i));
        }

        System.out.println(letras);
        System.out.println(invertidas);
    }

}

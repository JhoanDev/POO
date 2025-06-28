package Lista_Atual.F_ColecoesGenericas.Q94;

import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String entrada = "HELLO THERESKDFAJXNCAIDSFE\\&*@#QWERTYUIOPASDFGHJKLÇZXCVBMa";
        entrada = entrada.toUpperCase();
        for (Character aux : entrada.toCharArray()) {
            if (Character.isAlphabetic(aux)) {
                if (map.containsKey(aux))
                    map.put(aux, map.get(aux) + 1);
                else
                    map.put(aux, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println("Letra " + key + ": " + map.get(key));
        }
    }
}

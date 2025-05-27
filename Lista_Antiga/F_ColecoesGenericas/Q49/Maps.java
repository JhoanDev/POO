import java.util.Scanner;
import java.util.TreeMap;


public class Maps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap <Character, Integer> map = new TreeMap<>();
        String entrada = scan.nextLine();
        entrada = entrada.toUpperCase();
        scan.close();
        char letra;
        System.out.println("Entrada: " + entrada + "\n");
        for (int i = 0; i < entrada.length(); i++) {
            letra = entrada.charAt(i);
            if (map.containsKey(letra) && letra != ' ') 
                map.put(letra, map.get(letra) + 1);
            else if(letra != ' '){
                map.put(letra, 1);
            }
        }
        for (char key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

import java.util.TreeMap;

/**
 * DemoMapa
 */
public class DemoMapa {

    public static void main(String[] args) {
        String entrada = "Loren ipsum dolor sit amet consectetur adipiscing elit Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum loren ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborumloren ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum";    
        String[] palavras = entrada.split(" ");
        String lower;
        TreeMap<String, Integer> mapa = new TreeMap<String, Integer>(); 
        for (String palavra : palavras) {
            lower = palavra.toLowerCase();
            if (mapa.containsKey(lower)) {
                mapa.put(lower, mapa.get(lower) + 1);
            } else {
                mapa.put(lower, 1);
            }
        }
        for (String palavra : mapa.keySet()) {
            System.out.println(palavra + " : " + mapa.get(palavra.toLowerCase()));
        }
    }
}
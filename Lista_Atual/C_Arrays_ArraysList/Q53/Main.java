public class Main {
    public static void main(String args[]) {
        int dados[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            dados[i] = new int[5];
            for (int j = 0; j < 5; j++) {
                dados[i][j] = i + j;
                System.out.println(dados[i][j]);
            }
        }
    }
}
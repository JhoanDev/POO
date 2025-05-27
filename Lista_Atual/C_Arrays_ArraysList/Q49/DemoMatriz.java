public class DemoMatriz {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(1.3f, 2.5f, 3.7f, 4.9f);
        matriz.imprimeMatriz();
        System.out.println("Determinante: " + matriz.determinante());
    }    
}

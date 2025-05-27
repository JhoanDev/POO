public class DemoMatriz {
    public static void main(String[] args) {
        Matriz mat1 = new Matriz(1, 2, 3, 4);
        Matriz mat2 = new Matriz(2, 3, 2, 4);
        System.out.println(mat1);
        System.out.println("Determinante: " + mat1.calculaDeterminante());
        System.out.println("========================");
        System.out.println(mat2);
        System.out.println("Determinante: " + mat2.calculaDeterminante());
    }
    
}
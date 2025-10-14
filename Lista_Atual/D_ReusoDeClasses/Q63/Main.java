public class Main {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Lenilson", "O grande", 2025, 1, false);
        LivroBiblioteca livroBiblioteca2 = new LivroBiblioteca("Lenilson", "Economia Brasileira", 2025, 1, true);
        LivroLivraria livroLivraria = new LivroLivraria(100.0f, "Jhoan", "Algoritimos de Busca", 2024, 1);
        System.out.println(livroBiblioteca);
        System.out.println(livroBiblioteca2);
        System.out.println(livroLivraria);
    }
}

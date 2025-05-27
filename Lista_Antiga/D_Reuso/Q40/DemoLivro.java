public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Lógica de Programação", "Alan Turing", "2000", "UFERSA");
        System.out.println(livroBiblioteca); 
        livroBiblioteca.pegarEmprestado();
        System.out.println(livroBiblioteca); 
        livroBiblioteca.devolverLivro();
        System.out.println(livroBiblioteca); 

        System.out.println();

        LivroLivraria livroLivraria = new LivroLivraria("C é melhor que java", "Jhoan", "2022", "UFERSA", 29.99f);
        System.out.println(livroLivraria); 
        livroLivraria.aumentarPreco(5.0f);
        System.out.println(livroLivraria); 
        livroLivraria.diminuirPreco(10.0f);
        System.out.println(livroLivraria); 
        livroLivraria.aplicarDesconto(20.0f);
        System.out.println(livroLivraria);
    }
}

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Assembly journey", "Jhoan", "UFERSA", 2024, false,
                "corredor 2, prateleira D",
                "Jornada de um jovem na linguagem assembly de forma pratica e facil de entender esta linguagem de baixo nivel!");
        livro.empresta();
        livro.devolve();

        System.out.println(livro.qualAutor());
        System.out.println(livro.qualLivro());
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
        
        System.out.println(livro);
        livro.empresta();
        System.out.println(livro.estaEmprestado() ? "Esta emprestado" : "Nao esta emprestado");
    }
}

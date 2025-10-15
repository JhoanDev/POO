public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("UFERSA", "Lenilson", 2024, 150, "Ufersa Pau dos ferros",
                "Feito para aprender sobre o semi-árido");

        System.out.println("Emprestado: " + livro.estaEmprestado());
        livro.empresta();
        System.out.println("Emprestado: " + livro.estaEmprestado());
        livro.devolve();
        System.out.println("Local: " + livro.localizacao());
        System.out.println("descricao: " + livro.descricao());

        System.out.println("\n" + livro);
    }
}

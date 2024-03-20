public class LivroDeBiblioteca extends LivroB implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localização;
    private String descrição;

    public LivroDeBiblioteca(String titulo, String autor, String editora, int ano, boolean emprestado,
            String localização, String descrição) {
        super(titulo, autor, editora, ano);
        this.emprestado = emprestado;
        this.localização = localização;
        this.descrição = descrição;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void empresta() {
        if (emprestado)
            System.out.println("Ja esta emprestado");
        else
            emprestado = true;
    }

    public void devolve() {
        if (!emprestado)
            System.out.println("Voce nao pegou este livro");
        else
            emprestado = false;
    }

    public String localizacao(){
        return localização;
    }

    public String descricao(){
        return descrição;
    }

    @Override
    public String toString() {
        return "LivroDeBiblioteca [ " + super.toString() + ", emprestado=" + emprestado + ", localização=" + localização
                + ", descrição="
                + descrição + "]";
    }

}

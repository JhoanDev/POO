public class LivroBiblioteca extends Livro {
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, String ano, String editora) {
        super(titulo, autor, ano, editora);
        this.emprestado = false;
    }

    public void pegarEmprestado() {
        if (!emprestado) {
            emprestado = true;
        }else{
            System.out.println("O livro ja esta emprestado");
        }
    }

    public void devolverLivro() {
        if (emprestado) {
            emprestado = false;
        }else{
            System.out.println("Voce nao tem esse livro");
        }
    }

    public String toString() {
        return "Livro -> Emprestado: " + (emprestado ? "Sim, " : "Nao, ") + super.toString();
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
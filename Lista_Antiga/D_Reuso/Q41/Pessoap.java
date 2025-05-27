public class Pessoap {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    public Pessoap(String nome, String cpf, int idade, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {  
        String str = "\n";
        str += "Nome: " + nome + "\n";
        str += "CPF: " + cpf + "\n";
        str += "Idade: " + idade + "\n";
        str += "Altura: " + altura + "\n";
        return str;
    }
    
    
}
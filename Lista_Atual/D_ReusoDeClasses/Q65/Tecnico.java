package Lista_Atual.D_ReusoDeClasses.Q65;

public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, String matricula, double bonus) 
    {
        super(nome, salario, matricula);
        this.bonus = bonus;

        
    }

    public double ganhoAnual(){
        return (super.getSalario()*bonus) * 13;
    }

    @Override
    public String toString() {
        return "Tecnico [bonus=" + bonus + super.toString() + "]";
    }

}

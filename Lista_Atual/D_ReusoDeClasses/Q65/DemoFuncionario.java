package Lista_Atual.D_ReusoDeClasses.Q65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Administrativo adm = new Administrativo("Leticia", 12000, "12345", "noite");
        Administrativo adm2 = new Administrativo("Jhoan", 12000, "1234", "dia");

        Tecnico tec = new Tecnico("Pedro", 10000, "212445", 1.20);

        System.out.println(adm.toString() + "\tGanho anual: " + adm.ganhoAnual());
        System.out.println(adm2.toString() + "\tGanho anual: " + adm2.ganhoAnual());
        System.out.println(tec.toString() + "\tGanho anual: " + tec.ganhoAnual());
    }
}

public class DemoFunAdmTec {
    public static void main(String[] args) {
        // Testando Administrativo
        Administrativo admin = new Administrativo("Pedro", 3500, 2002, true); // Turno: Dia
        admin.aumentarSalario(400);
        System.out.println(admin);
        System.out.println("Ganho Anual: " + admin.ganhoAnual());

        // Testando Tecnico
        Tecnico tecnico = new Tecnico("Ana", 4000, 3003, 0.1); // Bonus Salarial: 10%
        tecnico.aumentarSalario(600);
        System.out.println(tecnico);
        System.out.println("Ganho Anual: " + tecnico.ganhoAnual());
    }
}

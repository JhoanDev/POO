public class Main {
    public static void main(String[] args) {
        Prefeito prefeito = new Prefeito("Lucas", "124.436.756", 35, 1.78, "PSDB", "Frutuoso");
        Governador governador = new Governador("Pedro", "435.576.897", 45, 1.67, "PT", "RN");

        System.out.println(prefeito);
        System.out.println(governador);
    }
}
public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegristroAcademico michael = new RegristroAcademico();
        michael.inicializaRegristroAcademico("Michael", "cs0981", 3, 0.75);
        double mensalidade = michael.calculaMensalidade();
        System.out.println("Mensalidade de michael: " + mensalidade);
        System.out.println("Matricula: " + michael.matricula);
    }
}

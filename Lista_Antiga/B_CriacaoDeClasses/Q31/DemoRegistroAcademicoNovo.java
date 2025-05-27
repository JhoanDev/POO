public class DemoRegistroAcademicoNovo {
    public static void main(String[] args) {
        RegristroAcademicoNovo jhoan = new RegristroAcademicoNovo("Jhoan", 7, 0.7);
        System.out.println(jhoan);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademicoNovo.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademicoNovo heitor = new RegristroAcademicoNovo("Heitor", 7, 0.7);
        System.out.println(heitor);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademicoNovo.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademicoNovo tomaz = new RegristroAcademicoNovo("Tomaz", 87, 0.4);
        System.out.println(tomaz);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademicoNovo.getTotalDeMatriculas());
        System.out.println();

        RegristroAcademicoNovo caio = new RegristroAcademicoNovo("Caio", 50, 1.7);
        System.out.println(caio);
        System.out.println("Quantidades de matriculas atuais: " + RegristroAcademicoNovo.getTotalDeMatriculas());
        System.out.println();
    }
}
public class DemoUniversidade {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao joao = new RegistroAcademicoPosGraduacao("Joao", "22082802", "BTI",
                "Um sistema web para prevencao de doencas", "walber");
        RegistroAcademico paula = new RegistroAcademico("paula", "09712397",
                "Antropologia");
        RegistroAcademicoPosGraduacao paulap = new RegistroAcademicoPosGraduacao(paula,
                "Antropologia na vida atlatica", "Pedro");
        System.out.println(joao);
        System.out.println(paulap);
    }

}
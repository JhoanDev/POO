public class Q17 {
    public static void main(String[] args) {
        double cidadeAhab = 7000;
        double cidadeBhab = 20000;
        double crescimentoA = 0.035;
        double crescimentoB = 0.01;
        System.out.printf("Cidade A habitantes: %,.0f\nCidade B habitantes: %,.0f\n\n", cidadeAhab, cidadeBhab);
        int anos = 0;
        while (cidadeAhab <= cidadeBhab) {
            cidadeAhab += cidadeAhab * crescimentoA;
            cidadeBhab += cidadeBhab * crescimentoB;
            anos++;
        }
        System.out.printf("Levou um total de %d anos para a cidade A ultrapassar ou igualar a cidade B\n\n", anos);
        System.out.printf("Cidade A habitantes: %,.0f\nCidade B habitantes: %,.0f\n\n", cidadeAhab, cidadeBhab);
    }
}

public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    int xFigura1;
    int yFigura1;
    int xFigura2;
    int yFigura2;

    public Desenho(FiguraGeometrica figura1,
            FiguraGeometrica figura2, int xFigura1, int yFigura1, int xFigura2,
            int yFigura2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.xFigura1 = xFigura1;
        this.yFigura1 = yFigura1;
        this.xFigura2 = xFigura2;
        this.yFigura2 = yFigura2;
    }

    public void apresenta() {
        System.out.printf("\nFigura 1: (%d,%d)\t", xFigura1, yFigura1);
        figura1.descricao();
        System.out.printf("Figura 2: (%d,%d)\t", xFigura2, yFigura2);
        figura2.descricao();
    }

}
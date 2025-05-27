public class Desenho {
    FiguraGeometrica fig1;
    int xfig1;
    int yfig1;
    FiguraGeometrica fig2;
    int xfig2;
    int yfig2;
    public Desenho(FiguraGeometrica fig1, int xfig1, int yfig1, FiguraGeometrica fig2, int xfig2, int yfig2) {
        this.fig1 = fig1;
        this.xfig1 = xfig1;
        this.yfig1 = yfig1;
        this.fig2 = fig2;
        this.xfig2 = xfig2;
        this.yfig2 = yfig2;
    }

    public void apresenta(){
        System.out.print("Cordenadas: (" + xfig1 + "," + yfig1 + ")\nFigura: ");
        fig1.desenha(); 
        System.out.print("Cordenadas: (" + xfig2 + "," + yfig2 + ")\nFigura: ");
        fig2.desenha(); 
    }


}

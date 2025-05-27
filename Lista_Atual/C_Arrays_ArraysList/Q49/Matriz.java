public class Matriz {
    private float[][] mat;

    public Matriz(float v1, float v2, float v3, float v4) {
        this.mat = new float[2][2];
        this.mat[0][0] = v1;
        this.mat[0][1] = v2;
        this.mat[1][0] = v3;
        this.mat[1][1] = v4;
    }

    public float determinante() {
        return ((this.mat[0][0] * this.mat[1][1]) - (this.mat[0][1] * this.mat[1][0]));
    }

    public void imprimeMatriz() {
        StringBuilder saida = new StringBuilder();
        saida.append("[").append(this.mat[0][0]).append("] ");
        saida.append("[").append(this.mat[0][1]).append("]\n");
        saida.append("[").append(this.mat[1][0]).append("] ");
        saida.append("[").append(this.mat[1][1]).append("]\n");
        System.out.println(saida.toString());
    }
}

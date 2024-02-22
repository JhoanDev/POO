public class Matriz {
    private float elementos[][];

    public Matriz(float v1,float v2,float v3,float v4) {
        elementos = new float[2][2];
        elementos[0][0] = v1;
        elementos[0][1] = v2;
        elementos[1][0] = v3;
        elementos[1][1] = v4;
    }

    public float calculaDeterminante(){
        return (elementos[0][0] * elementos[1][1]) - (elementos[1][0] * elementos[0][1]);
    }

    public String toString(){
        String str = "";
        str += "[" + elementos[0][0] + "] [" + elementos[0][1] + "]\n";
        str += "[" + elementos[1][0] + "] [" + elementos[1][1] + "]\n";
        return str;
    }
    
    
}
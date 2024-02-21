public class TresGen<Gen> {
    private Gen atributo1;
    private Gen atributo2;
    private Gen atributo3;

    public TresGen(Gen atributo1, Gen atributo2, Gen atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int quantosIguais() {
        int cont = 0;
        if (atributo1.equals(atributo2) && atributo1.equals(atributo3)){
            cont = 3;
        }
        else if(atributo1.equals(atributo2) || atributo1.equals(atributo3)){
            cont = 2;
        }
        else if (atributo2.equals(atributo3)){
            cont = 2;
        }
        return cont;
    }

    public void imprimirAtributos(){
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }

}
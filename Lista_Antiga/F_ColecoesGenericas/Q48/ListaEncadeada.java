import java.util.*;

public class ListaEncadeada {
    public static void main(String[] args) {
        LinkedList <Character> lista = new LinkedList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J'));
        LinkedList <Character> copia = new LinkedList<>();
        ListIterator <Character> itr = lista.listIterator();
        while (itr.hasNext())
            itr.next();
        while (itr.hasPrevious())
            copia.add(itr.previous());
        System.out.println("Lista inicial: " + lista);
        System.out.println("Copia invertida: " + copia);
    }
}

//*
//----------
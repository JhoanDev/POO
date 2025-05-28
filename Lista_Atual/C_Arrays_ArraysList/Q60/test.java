public class test {
    public static void main(String[] SSn10) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        final int tam = a.length;
        for (int f = 0; f < tam; f++)
            a[f] = a[f] * f;
        tam = b.length;
        for (int f = 0; f < tam; f++)
            b[f] += a[f / 2] % (f + 1);
    }
}
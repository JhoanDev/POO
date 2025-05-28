public class App {
    public static void main(String[] args) {
        int[] j = new int[6];
        for (int i = 0; i < 6; i++)
            j[i] = i;
        App func = new App();
        System.out.println(func.f(j, 6));
    }

    public int f(int j[], int n) {
        if (n <= 0)
            return 1;
        return j[n - 1] * f(j, n - 2) + 1;
    }
}
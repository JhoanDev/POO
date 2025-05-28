public class Main {
    public static void main(String[] args) {
        Integer[] A = new Integer[3];
        A[0] = 2;
        A[1] = 3;
        A[2] = 9;
        proc(A, A[2]);
        System.out.println(A[0] + A[1] + A[2]);
    }

    private static void proc(Integer[] B, Integer c) {
        B[0] = c;
        B[2] = B[0] + B[1];
    }
}
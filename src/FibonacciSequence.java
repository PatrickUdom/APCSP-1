public class FibonacciSequence {
    public static void main(String[] args){
        int N = 12;
        int N1 = 0;
        int N2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.println(N1);
            int N3 = N1 + N2;
            N1 = N2;
            N2 = N3;
        }
    }
}
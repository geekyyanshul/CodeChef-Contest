import java.util.*;

class movieHype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i <= N; i++) {A[i] = sc.nextInt();}
            int minimumLoudnessCount = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int loudnessCount = Math.max(A[i], A[i + 1]);
                minimumLoudnessCount = Math.min(minimumLoudnessCount, loudnessCount);
            }
            System.out.println(minimumLoudnessCount);
        }
    }
}

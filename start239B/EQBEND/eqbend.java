import java.util.*;

class CodeChef {
    public static void main(String[] args) throws Exception {
        Scanner jhethaBhai = new Scanner(System.in);

        int T = jhethaBhai.nextInt();

        while (T-- > 0) {
            int N = jhethaBhai.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = jhethaBhai.nextInt();
            }

            int valuee = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (A[i] == A[j]) {
                        int moves = i + (N - 1 - j);
                        valuee = Math.min(valuee, moves);
                    }
                }
            }

            if (valuee == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(valuee);
            }
        }
    }
}
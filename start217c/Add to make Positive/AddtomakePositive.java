
import java.util.*;

class AddtomakePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int sumKardo = 0;
            for (int i = 0; i < N; i++) {//-5,-3,1=-7
                sumKardo += sc.nextInt();
            }
            if (sumKardo >= 0) {
                System.out.println(0);
            } else {
                int yoyoyoX = (-sumKardo + N - 1) / N;   
                System.out.println(yoyoyoX);
            }
        }
    }
}


import java.lang.*;
import java.util.*;
     // Solution for Odd String problem from START221B
class OddString
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T--> 0) {
                int N = sc.nextInt();
                String S = sc.next();
                int[] FCouynt = new int[26];
                boolean Workable = true;

                for (int i = 0; i < N; i++) {
                    char c = S.charAt(i);
                    FCouynt[c - 'a']++;

                    if (FCouynt[c - 'a'] > 2) {
                        Workable = false;
                        break;
                    }
                }

                if (Workable) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
package start228b.ballonSp;
 
import java.io.*;
import java.util.StringTokenizer;

public class ballonSp {
    public static void main(String[] a) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String l = b.readLine();
        if (l == null) return;
        
        int t = Integer.parseInt(l.trim());
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(b.readLine().trim());
            int[] x = new int[n];
            
            StringTokenizer k = new StringTokenizer(b.readLine());
            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(k.nextToken());
            }

            int c = 0;
            int[] y = new int[n];

            for (int i = 0; i < n; i++) {
                if (x[i] <= c) {
                    y[i] = x[i];
                } else {
                    y[i] = c;
                    c++;
                }
            }

            for (int i = 0; i < n; i++) {
                s.append(y[i]).append(i == n - 1 ? "" : " ");
            }
            s.append("\n");
        }
        System.out.print(s.toString());
    }
}
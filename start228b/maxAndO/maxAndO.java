package start228b.maxAndO;

 
import java.io.*;
import java.util.StringTokenizer;

public class maxAndO {
    static final int M = 1000000007;

    static long p(long b, long e) {
        long r = 1;
        b %= M;
        while (e > 0) {
            if ((e & 1) != 0) r = (r * b) % M;
            b = (b * b) % M;
            e >>= 1;
        }
        return r;
    }

    public static void main(String[] a) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String l = b.readLine();
        if (l == null) return;

        int t = Integer.parseInt(l.trim());
        StringBuilder s = new StringBuilder();

        while (t-- > 0) {
            l = b.readLine();
            while (l != null && l.trim().isEmpty()) {
                l = b.readLine();
            }
            if (l == null) break;

            StringTokenizer k = new StringTokenizer(l);
            long n = Long.parseLong(k.nextToken());
            long m = Long.parseLong(k.nextToken());

            long u = (m * (m + 1) / 2) % M;
            long x = (n % M) * p(m, n - 1) % M;
            x = (x * u) % M;

            long y = 0;
            for (int j = 1; j <= m; j++) {
                y = (y + p(j, n)) % M;
            }

            long z = (x - y + M) % M;
            s.append(z).append("\n");
        }
        System.out.print(s.toString());
    }
}
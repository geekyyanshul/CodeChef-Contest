import java.io.*;
import java.util.*;

 class monoChromeMinimization {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int testCases = Integer.parseInt(reader.readLine().trim());

        while (testCases-- > 0) {
            String[] sizes = reader.readLine().trim().split("\\s+");
            int n = Integer.parseInt(sizes[0]);
            int m = Integer.parseInt(sizes[1]);

            long[] a = new long[n];
            String[] aStr = reader.readLine().trim().split("\\s+");
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(aStr[i]);

            long[] b = new long[m];
            String[] bStr = reader.readLine().trim().split("\\s+");
            for (int i = 0; i < m; i++) b[i] = Long.parseLong(bStr[i]);

            Arrays.sort(a);
            Arrays.sort(b);

            long answer = Long.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                long aLeftWidth = a[i] - a[0];
                long aLeftMax = a[i];
                long aRightWidth = a[n - 1] - a[i + 1];
                long aRightMax = a[n - 1];

                for (int j = 0; j < m - 1; j++) {
                    long bLeftWidth = b[j] - b[0];
                    long bLeftMax = b[j];
                    long bRightWidth = b[m - 1] - b[j + 1];
                    long bRightMax = b[m - 1];

                    long red1 = Math.max(aLeftWidth * bLeftMax, bLeftWidth * aLeftMax);
                    long blue1 = Math.max(aRightWidth * bRightMax, bRightWidth * aRightMax);
                    answer = Math.min(answer, Math.max(red1, blue1));

                    long red2 = Math.max(aLeftWidth * bRightMax, bRightWidth * aLeftMax);
                    long blue2 = Math.max(aRightWidth * bLeftMax, bLeftWidth * aRightMax);
                    answer = Math.min(answer, Math.max(red2, blue2));
                }
            }

            writer.println(answer);
        }

        writer.flush();
    }
}

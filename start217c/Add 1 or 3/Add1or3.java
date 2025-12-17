package start217c.Add 1 or 3;

import java.util.*;
import java.lang.*;
import java.io.*;

class Add1or3 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            long NaNanana = sc.nextLong(); // N
            long Meow = sc.nextLong();     // M

            if (Meow >= NaNanana && Meow <= 3 * NaNanana && (Meow - NaNanana) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

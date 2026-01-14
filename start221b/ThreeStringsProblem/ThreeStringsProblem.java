package start221b.ThreeStringsProblem;
import java.util.*;
 
class ThreeStringsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        while (testCount--> 0) {
            int length = sc.nextInt();
            sc.nextLine();
            String base = sc.nextLine();
            String first = sc.nextLine();
            String second = sc.nextLine();
            calculate(length, base, first, second);
        }
    }
    private static void calculate(int length, String base, String first, String second) {
        int surplusZero = 0, deficitZero = 0;
        int surplusOne = 0, deficitOne = 0;
        for (int i = 0; i < length; i++) {
            int a = base.charAt(i) - '0';
            int b = first.charAt(i) - '0';
            int c = second.charAt(i) - '0';
            int diff = b - c;
            if (a == 0) {
                if (diff == 1) surplusZero++;
                else if (diff == -1) deficitZero++;
            }
            else {
                if (diff == 1) surplusOne++;
                else if (diff == -1) deficitOne++;
            }
        }
        int globalDiff = (surplusZero + surplusOne) - (deficitZero + deficitOne);
        long answer = 0;
        if (globalDiff > 0) {
            answer += globalDiff;
            int desired = surplusZero - deficitZero;
            int lower = Math.max(0, globalDiff - surplusOne);
            int upper = Math.min(surplusZero, globalDiff);
            int chosen;
            if (desired < lower) chosen = lower;
            else if (desired > upper) chosen = upper;
            else chosen = desired;
            int remaining = (surplusZero - chosen) - deficitZero;
            answer += Math.abs(remaining);
        }
        else if (globalDiff < 0) {
            int needed = -globalDiff;
            answer += needed;
            int desired = deficitZero - surplusZero;
            int lower = Math.max(0, needed - deficitOne);
            int upper = Math.min(deficitZero, needed);
            int chosen;
            if (desired < lower) chosen = lower;
            else if (desired > upper) chosen = upper;
            else chosen = desired;
            int remaining = surplusZero - (deficitZero - chosen);
            answer += Math.abs(remaining);
        }
        else {
            int balance = surplusZero - deficitZero;
            answer += Math.abs(balance);
        }
        System.out.println(answer);
    }
}
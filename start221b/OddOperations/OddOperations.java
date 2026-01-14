

import java.util.*;
class OddOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests--> 0) {
            String numStr = sc.next();
            System.out.println(check(numStr));
        }
    }
    static int check(String numStr) {
        int length = numStr.length();
        int lastDigit = numStr.charAt(length - 1) - '0';
        if (lastDigit % 2 != 0) return 0;
        boolean oddFound = false;
        int biggestDigit = -1;
        int unit = lastDigit;
        for (char ch: numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 != 0) {
                oddFound = true;
                break;
            }
            if (digit > biggestDigit) {
                biggestDigit = digit;
            }
        }
        if (oddFound) return 1;
        if (length == 1) return -1;
        if (biggestDigit > unit) return 2;
        else return 3;
    }
}
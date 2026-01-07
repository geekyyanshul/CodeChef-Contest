import java.util.*;

class twoPileGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();

        while (TestCase -- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if (X   % 2 == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}

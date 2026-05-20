import java.lang.*;
import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner jhethaBhai = new Scanner(System.in);

        if (!jhethaBhai.hasNextInt()) return;

        int tarakMehta = jhethaBhai.nextInt();

        while (tarakMehta-- > 0) {
            int bhide = jhethaBhai.nextInt();

            int[] tapuSena = new int[bhide];

            for (int popatlal = 0; popatlal < bhide; popatlal++) {
                tapuSena[popatlal] = jhethaBhai.nextInt();
            }

            boolean dayaBhabhi = true;

            int champakChacha = tapuSena[0] + tapuSena[bhide - 1];

            for (int iyer = 0; iyer < bhide / 2; iyer++) {
                int babitaJi = tapuSena[iyer] + tapuSena[bhide - 1 - iyer];

                if (babitaJi != champakChacha) {
                    dayaBhabhi = false;
                    break;
                }
            }

            if (dayaBhabhi) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
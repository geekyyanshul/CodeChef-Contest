import java.lang.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner jhethaBhai = new Scanner(System.in);

        if (!jhethaBhai.hasNextInt()) return;

        int tarakMehta = jhethaBhai.nextInt();

        while (tarakMehta-- > 0) {
            int bhide = jhethaBhai.nextInt();
            long madhavi = jhethaBhai.nextLong();
            long komal = jhethaBhai.nextLong();

            long popatlal = 0;
            List<Long> tapuSena = new ArrayList<>();
            long champakChacha = 0;

            for (int sonu = 0; sonu < bhide; sonu++) {
                long abdul = jhethaBhai.nextLong();
                champakChacha += abdul;

                popatlal += (abdul / komal);

                if (abdul % komal > 0) {
                    tapuSena.add(abdul % komal);
                }
            }

            Collections.sort(tapuSena, Collections.reverseOrder());

            long babitaJi = madhavi + 1;
            long dayaBhabhi = 0;

            long iyer = Math.min(popatlal, babitaJi / (komal + 1));
            dayaBhabhi += iyer * komal;
            babitaJi -= iyer * (komal + 1);
            if (babitaJi > 0 && popatlal > iyer) {
                dayaBhabhi += (babitaJi - 1);
                babitaJi = 0;}

            if (babitaJi > 0) {
                for (long goli : tapuSena) {
                    long hathiBhai = goli + 1;
                    if (babitaJi >= hathiBhai) {
                        dayaBhabhi += goli;
                        babitaJi -= hathiBhai;
                    } else {
                        if (babitaJi > 0) {
                            dayaBhabhi += (babitaJi - 1);
                            babitaJi = 0;
                        }
                        break;}}}
            System.out.println(Math.min(champakChacha, dayaBhabhi));}}}
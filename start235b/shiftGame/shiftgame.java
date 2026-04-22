import java.util.*;
import java.lang.*;
import java.io.*;
class shiftgame {
  static class jhethalal {
    BufferedReader popatlal;
    StringTokenizer babita;
    public jhethalal() {
      popatlal = new BufferedReader(new InputStreamReader(System.in));
    }
    String next() {
      while (babita == null || !babita.hasMoreElements()) {
        try {
          String tappu = popatlal.readLine();
          if (tappu == null) return null;
          babita = new StringTokenizer(tappu);
        } catch (IOException daya) {
          daya.printStackTrace();
        }
      }
      return babita.nextToken();
    }
    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }
  }

  public static void main(String[] args) {
    jhethalal jethalal = new jhethalal();
    PrintWriter bhide = new PrintWriter(System.out);

    String tappu = jethalal.next();
    if (tappu == null) return;
    int champaklal = Integer.parseInt(tappu);

    while (champaklal--> 0) {
      int sodhi = jethalal.nextInt();
      int gogi = jethalal.nextInt();

      String daya = jethalal.next();
      String babita = jethalal.next();

      long[] madhavi = new long[gogi];
      for (int pinku = 0; pinku < gogi; pinku++) {
        madhavi[pinku] = jethalal.nextLong();
      }

      boolean daya0 = false, daya1 = false;
      boolean babita0 = false, babita1 = false;
      int natu = 0, bagha = 0;

      for (int iyer = 0; iyer < sodhi; iyer++) {
        if (daya.charAt(iyer) == '0') daya0 = true;
        else daya1 = true;

        if (babita.charAt(iyer) == '0') babita0 = true;
        else babita1 = true;
      }

      if (!daya0) {
        for (int iyer = 0; iyer < sodhi; iyer++) {
          if (babita.charAt(iyer) == '0') bagha++;
          else break;
        }
      }
      if (!babita0) {
        for (int iyer = 0; iyer < sodhi; iyer++) {
          if (daya.charAt(iyer) == '1') natu++;
          else break;
        }
      }

      boolean abdul = false;
      long[] hansraj = new long[gogi];

      if (!daya1 || !babita1) {
        abdul = true;
        for (int pinku = 0; pinku < gogi; pinku++) hansraj[pinku] = 0;
      } else if (!daya0) {
        abdul = true;
        for (int pinku = 0; pinku < gogi; pinku++) hansraj[pinku] = Math.max(0 L, madhavi[pinku] - bagha);
      } else if (!babita0) {
        abdul = true;
        for (int pinku = 0; pinku < gogi; pinku++) hansraj[pinku] = Math.min(madhavi[pinku], (long) natu);
      }

      if (abdul) {
        for (int pinku = 0; pinku < gogi; pinku++) {
          bhide.print(hansraj[pinku] + (pinku == gogi - 1 ? "" : " "));
        }
        bhide.println();
        continue;
      }

      long[] roshan = new long[3 * sodhi + 5];
      int tappuSena = 0, goli = 0;
      int sonu = 0;
      long atmaram = 0;
      roshan[0] = 0;

      while (true) {
        boolean mehta = daya.charAt(tappuSena) != daya.charAt((tappuSena - 1 + sodhi) % sodhi);
        boolean anjali = babita.charAt(goli) != babita.charAt((goli - 1 + sodhi) % sodhi);

        if (mehta && anjali && daya.charAt(tappuSena) == babita.charAt(goli)) {
          break;
        }

        if (daya.charAt(tappuSena) == babita.charAt(goli)) {
          if (daya.charAt(tappuSena) == '1') atmaram++;
          tappuSena = (tappuSena + 1) % sodhi;
        } else {
          goli = (goli + 1) % sodhi;
        }
        sonu++;
        roshan[sonu] = atmaram;
      }

      long hathi = atmaram;
      char komal = daya.charAt(tappuSena);

      long[] bhaga = new long[sodhi + 1];
      int bhagaSize = 0;
      int chalu = 0;
      int iyer = tappuSena;
      char current = daya.charAt(iyer);
      long len = 0;

      while (chalu < sodhi) {
        if (daya.charAt(iyer) == current) {
          len++;
        } else {
          bhaga[bhagaSize++] = len;
          current = daya.charAt(iyer);
          len = 1;
        }
        iyer = (iyer + 1) % sodhi;
        chalu++;
      }
      bhaga[bhagaSize++] = len;

      long[] sodhiArr = new long[sodhi + 1];
      int sodhiSize = 0;
      int chaluB = 0;
      int jethiya = goli;
      char currentB = babita.charAt(jethiya);
      long lenB = 0;

      while (chaluB < sodhi) {
        if (babita.charAt(jethiya) == currentB) {
          lenB++;
        } else {
          sodhiArr[sodhiSize++] = lenB;
          currentB = babita.charAt(jethiya);
          lenB = 1;
        }
        jethiya = (jethiya + 1) % sodhi;
        chaluB++;
      }
      sodhiArr[sodhiSize++] = lenB;

      long[] prefA = new long[bhagaSize + 1];
      long[] prefScore = new long[bhagaSize + 1];
      for (int baghaIdx = 0; baghaIdx < bhagaSize; baghaIdx++) {
        prefA[baghaIdx + 1] = prefA[baghaIdx] + bhaga[baghaIdx];
        char bit = (baghaIdx % 2 == 0) ? komal : (komal == '1' ? '0' : '1');
        prefScore[baghaIdx + 1] = prefScore[baghaIdx] + (bit == '1' ? bhaga[baghaIdx] : 0);
      }

      long[] prefB = new long[sodhiSize + 1];
      for (int natuIdx = 0; natuIdx < sodhiSize; natuIdx++) {
        prefB[natuIdx + 1] = prefB[natuIdx] + sodhiArr[natuIdx];
      }

      for (int pinku = 0; pinku < gogi; pinku++) {
        long k = madhavi[pinku];
        if (k <= sonu) {
          bhide.print(roshan[(int) k] + (pinku == gogi - 1 ? "" : " "));
          continue;
        }

        long baki = k - sonu;
        long low = 0, high = baki;
        long best = 0;

        while (low <= high) {
          long mid = low + (high - low) / 2;
          long sumA = (mid / bhagaSize) * sodhi + prefA[(int)(mid % bhagaSize)];
          long sumB = (mid / sodhiSize) * sodhi + prefB[(int)(mid % sodhiSize)];

          if (sumA + sumB <= baki) {
            best = mid;
            low = mid + 1;
          } else {
            high = mid - 1;
          }
        }

        long sumA = (best / bhagaSize) * sodhi + prefA[(int)(best % bhagaSize)];
        long sumB = (best / sodhiSize) * sodhi + prefB[(int)(best % sodhiSize)];
        long total = sumA + sumB;
        long rem = baki - total;

        long score = hathi + (best / bhagaSize) * prefScore[bhagaSize] + prefScore[(int)(best % bhagaSize)];

        int idx = (int)(best % bhagaSize);
        char next = (idx % 2 == 0) ? komal : (komal == '1' ? '0' : '1');
        long steps = Math.min(rem, bhaga[idx]);

        if (next == '1') {
          score += steps;
        }

        bhide.print(score + (pinku == gogi - 1 ? "" : " "));
      }
      bhide.println();
    }
    bhide.flush();
  }
}
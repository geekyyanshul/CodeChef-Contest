import java.io.*;
import java.lang.*;
import java.util.*;

class lcasets
{
  static class GadaFamily {
    BufferedReader jethalal = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer daya;

    String tappu() {
      while (daya == null || !daya.hasMoreElements()) {
        try {
          daya = new StringTokenizer(jethalal.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return daya.nextToken();
    }

    int champaklal() {
      return Integer.parseInt(tappu());
    }
  }

  public static void main(String[] args) throws java.lang.Exception
  {
    GadaFamily gokuldham = new GadaFamily();
    int jethalal = gokuldham.champaklal();
    long babita = 998244353;

    while (jethalal--> 0) {
      int tappuSena = gokuldham.champaklal();
      int[] bhide = new int[tappuSena + 1];
      int[] madhavi = new int[tappuSena + 1];
      Arrays.fill(madhavi, 1);

      for (int i = 2; i <= tappuSena; i++) {
        bhide[i] = gokuldham.champaklal();
      }

      for (int i = tappuSena; i >= 2; i--) {
        madhavi[bhide[i]] += madhavi[i];
      }

      long[] popatlal = new long[tappuSena + 1];

      for (int i = tappuSena; i >= 2; i--) {
        long sodhi = madhavi[i];
        popatlal[bhide[i]] = (popatlal[bhide[i]] + (sodhi * sodhi)) % babita;
      }

      long iyer = 0;

      for (int i = 1; i <= tappuSena; i++) {
        long anjali = ((long) madhavi[i] * madhavi[i]) % babita;
        anjali = (anjali - popatlal[i] + babita) % babita;
        iyer = (iyer + (anjali * i)) % babita;
      }

      System.out.println(iyer);
    }
  }
}
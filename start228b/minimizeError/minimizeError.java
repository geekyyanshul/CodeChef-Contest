package start228b.minimizeError;

 
import java.io.*;
import java.lang.*;
import java.util.*;

class minimizeError
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String b = a.readLine();
        if (b == null) return;
        
        int c = Integer.parseInt(b.trim());
        StringBuilder d = new StringBuilder();
        
        while (c-- > 0) {
            StringTokenizer e = new StringTokenizer(a.readLine());
            
            long f = Long.parseLong(e.nextToken());
            long g = Long.parseLong(e.nextToken());
            
            long h = (f + g) / (2 * g + 2);
            
            d.append(h).append("\n");
        }
        
        System.out.print(d.toString());
    }
}
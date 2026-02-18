
import java.io.*;
import java.lang.*;
import java.util.*;

class iceCreamCone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner (System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		while(t-- > 0){
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  int n = sc.nextInt();
		  
		  int iceRemain = y*n;
		  if(iceRemain > x){
		    out.println("0");
		  }
		  else {
		    System.out.println(x-iceRemain);
		  }
		  out.flush();
		}

	}
}

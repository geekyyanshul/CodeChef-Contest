package start228b.minAndO;


import java.lang.*;
import java.util.*;

public class minAndO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-- > 0){
		  int n = sc.nextInt();
		    int snd = (n * (n + 2)) / 4;
		    System.out.println(snd);
		}

	}
}

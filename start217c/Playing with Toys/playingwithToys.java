
import java.util.*;
import java.lang.*;
import java.io.*;

class playingwithToys
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int gifts = sc.nextInt();//1
		int days = sc.nextInt();//2
		if (gifts < days){
		    System.out.println(0);
		}
		else {
		    System.out.println(gifts-days);
		}

	}
}

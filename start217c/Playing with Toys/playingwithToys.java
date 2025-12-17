
import java.util.*;
import java.lang.*;
import java.io.*;

class playingwithToys
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int AhadChoco = sc.nextInt();//1
		int days = sc.nextInt();//2
		if (AhadChoco < days){
		    System.out.println(0);
		}
		else {
		    System.out.println(AhadChoco-days);
		}

	}
}

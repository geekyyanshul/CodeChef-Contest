import java.lang.*;
import java.util.*;

class movie
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
	  int n = sc.nextInt();//number of tickets
	  int m = sc.nextInt();//buckets of popcorn
	  int a = sc.nextInt();//movie ticket price
	  int b = sc.nextInt();//popcorn price
	  int c = sc.nextInt();//movie and popcorn together
	   int popAndMov = Math.min(n,m);
            
            int FCosting = popAndMov * c 
                     + (n - popAndMov) * a 
                     + (m - popAndMov) * b;
            
            System.out.println(FCosting);
	}

	}
}

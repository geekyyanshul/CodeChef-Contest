import java.lang.*;
import java.util.*;

class subAaddB
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-- > 0){
	  int n = sc.nextInt();
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  
            while (n >= a) {
                n -= (a - b);
            }
            
    System.out.println(n);
	    
	  }
	}}
 

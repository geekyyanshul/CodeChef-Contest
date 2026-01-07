import java.lang.*;
import java.util.*;

class fbMatching
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		while (t-- > 0){
		    int n =sc.nextInt();
		    String S = sc.next();
		    char [] ScharacterArray = S.toCharArray();
		    String st = "no";
		    Arrays.sort(ScharacterArray);
		    
		    for (int i =0;i<n-1;i++){
		        if (ScharacterArray[i]==ScharacterArray[i+1]){
		            st ="yes";
		            break;
		        }
		         
		    }
		    System.out.println(st);
		    
		}

	}
}

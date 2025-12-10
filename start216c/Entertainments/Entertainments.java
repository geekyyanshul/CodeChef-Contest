import java.lang.*;
import java.util.*;

public class Entertainments 
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int c =n*200;
	if ( c < 1000){
	    System.out.println(n*200);
	}
	else {System.out.println("1000");}

	}
}
/*Entertainments
Chef is trying to entertain 
N
N children. He has 
2
2 options:

Buy a single television for all the children to watch. This will cost 
1000
1000 rupees.
Buy 
N
N toys, one for each child. This will cost 
200
200 rupees for each toy.
What is the minimum cost Chef needs to pay to entertain all the children?

Input Format
The first and only line of input contains a single integer 
N
N - the number of children.
Output Format
Output the cost to entertain all children.

Constraints
1
≤
N
≤
10
1≤N≤10
Sample 1:
Input
Output
1
200
Explanation:
Chef can buy 
1
1 toy for the only child and spend 
200
200 rupees. This is cheaper than buying a television for 
1000
1000 rupees.

Sample 2:
Input
Output
10
1000
Explanation:
Chef can buy a television for all 
10
10 children to watch. This is cheaper than buying 
10
10 individual toys costing 
2000
2000 rupees.

accepted
Accepted
115
total-Submissions
Submissions
147
accuracy
Accuracy
80.95
Did you like the problem statement?
36 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
 */
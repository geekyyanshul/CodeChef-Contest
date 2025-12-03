import java.lang.*;
import java.util.*;

class GemBundles
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt();
	while(t-->0){
	    int r = sc.nextInt();
	    int b = sc.nextInt();
	    int g = sc.nextInt();
	    
	    int min = Math.min(r,Math.min(b,g));
	    int rmin = r-min;
	    int bmin = b-min;
	    int gmin = g-min;
	    
	    
	   System.out.println((min*10)+((rmin+bmin+gmin)*3));
	}

	}
}

/*Problem StateMent-1 
Gem Bundles
You have 
R
R red gems, 
B
B blue gems and 
G
G green gems. Each gem normally sells for 
3
3 coins.

However, if you make a bundle of 
1
1 red gem, 
1
1 blue gem and 
1
1 green gem; you can sell it for 
10
10 coins instead.

What is the maximum number of coins you can earn?

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line of input contains 
3
3 integers - 
R
R, 
B
B and 
G
G.
Output Format
For each test case, output on a new line the maximum number of coins you can earn.

Constraints
1
≤
T
≤
1331
1≤T≤1331
0
≤
R
,
B
,
G
≤
10
0≤R,B,G≤10
Sample 1:
Input
Output
3
1 1 1
0 10 10
5 2 4
10
60
35
Explanation:
Test case 
1
1: You make exactly 
1
1 bundle which sells for 
10
10 coins.

Test case 
2
2: Since you have no red gems, you cannot make any bundle. So, you sell all the 
20
20 gems separately for 
20
⋅
3
=
60
20⋅3=60 coins.

accepted
Accepted
2826
total-Submissions
Submissions
3244
accuracy
Accuracy
91.31
 
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
*/


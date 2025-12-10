 
import java.lang.*;
import java.util.*;

public class BestSeats
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        int Tests = sc.nextInt();  

        while (Tests-- > 0) {
            int N = sc.nextInt();  
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int minmunCosting = A[0] + A[1];

            for (int i = 1; i < N - 1; i++) {
                minmunCosting = Math.min(minmunCosting, A[i] + A[i + 1]);
            }

            System.out.println(minmunCosting);
        }

        sc.close();
    }
}










/*Best Seats
Chef and Chefina are trying to watch a cricket game. They have already decided a row of 
N
N seats where they will seat, but they are yet to figure out the exact 
2
2 seats they will buy.

The 
i
i-th seat in the row costs 
A
i
A 
i
​
  coins to buy. Obviously, they have to sit next to each other, so they will only buy adjacent seats.

Can you figure out the minimum cost for them to buy 
2
2 seats such that they are able to sit together?

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains a single integer 
N
N - the number of seats in the row.
The second line contains 
N
N integers - 
A
1
,
A
2
,
…
,
A
N
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
 .
Output Format
For each test case, output on a new line the minimum cost of buying 
2
2 adjacent seats.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
100
2≤N≤100
1
≤
A
i
≤
100
1≤A 
i
​
 ≤100
Sample 1:
Input
Output
3
2
5 10
3
1 3 2
5
100 98 97 99 97
15
4
195
Explanation:
Test Case 1 : There are only 
2
2 seats in the row, so they have to buy those 
2
2. They cost a total of 
5
+
10
5+10 coins.

Test Case 2 : They can choose to buy seat numbered 
1
1 and seat numbered 
2
2 for a cost of 
1
+
3
=
4
1+3=4.

accepted
Accepted
2533
total-Submissions
Submissions
2688
accuracy
Accuracy
96.02
Did you like the problem statement?
20 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
     */
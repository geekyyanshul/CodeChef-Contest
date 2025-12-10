
import java.lang.*;
import java.util.*;
public class Scoring    
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        
        int Tests = sc.nextInt();
        
        while (Tests-- > 0) {
            int Xvalue = sc.nextInt();
            int Y = sc.nextInt();
            
            int alice = (Y + Xvalue) / 2;
            int bob = (Y - Xvalue) / 2;
            
            System.out.println(alice + " " + bob);
        }
  
        sc.close();
    }
}














/*
Scored
09
Min
02
Sec
Scoring
Alice and Bob were playing a game with points to score. Each player's score is some non-negative integer number of points.

In the end, Alice won the game by scoring 
X
X more points than Bob. Further, it is known that the total number of points scored by both of them was 
Y
Y.

With this information, your task is to find how many points Alice scored, and how many points Bob scored. It is guaranteed that the input is generated such that there exists a valid solution.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line of each test case contains 
2
2 integers - 
X
X and 
Y
Y.
Output Format
For each test case, output on a new line Alice and Bob's scored points.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
,
Y
≤
100
1≤X,Y≤100
There exists a valid solution to each input test.
Sample 1:
Input
Output
3
1 1
2 8
6 8
1 0
5 3
7 1
Explanation:
Test Case 1 : It is given that Alice scored 
1
1 more point than Bob, and the total scored points was 
1
1. In this case, the only possible solution is Alice scored 
1
1 point and Bob scored 
0
0.

accepted
Accepted
2545
total-Submissions
Submissions
2844
accuracy
Accuracy
91.98 */
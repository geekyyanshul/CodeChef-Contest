
import java.util.Scanner;
public class SpecialMissions {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] A = new int[n];
            for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();

            String StringHaiJI = sc.next();

            int sumOfcourse0 = 0, sumOfcourse1 = 0;

            for (int i = 0; i < n; i++) {
                if (StringHaiJI.charAt(i) == '0')
                    sumOfcourse0 += A[i];
                else
                    sumOfcourse1 += A[i];
            }

            int ans = sumOfcourse0;

            if (sumOfcourse0 >= c && sumOfcourse1 > c)
                ans = sumOfcourse0 + sumOfcourse1 - c;

            System.out.println(ans);
        }
    }
}
/*Special Missions
You are playing a game with 
N
N missions to complete. The 
i
i-th mission pays 
A
i
A 
i
​
  coins. You can choose whether to complete each mission or not, and also the order in which you want to complete them.

However, some of the missions are special ones, and to access them you need to pay a one-time fee to a wizard, of 
C
C coins. (You only need to pay once, not per every special mission you wish to complete).

You are given an binary string 
S
S, where 
S
i
=
1
S 
i
​
 =1 if the 
i
i-th mission is special and 
S
i
=
0
S 
i
​
 =0 otherwise.

What is the maximum coins you can obtain? You start with 
0
0 coins.
Note that you cannot have a negative coin balance at any point of time - that is, if you decide to pay 
C
C coins to the wizard to unlock the special missions, you must have at least 
C
C coins with you beforehand.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of three lines of input.
The first line of each test case contains 
2
2 space-separated integers - 
N
N and 
C
C.
The second line contains 
N
N space-separated integers - 
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
The third line contains a binary string 
S
S.
Output Format
For each test case, output on a new line the maximum number of coins you can obtain.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
100
1≤N≤100
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
1
≤
C
≤
10000
1≤C≤10000
∣
S
∣
=
N
∣S∣=N
S
i
∈
{
0
,
1
}
S 
i
​
 ∈{0,1}
Sample 1:
Input
Output
5
2 2
1 5
01
2 2
1 5
10
4 5
10 10 10 10
0011
2 1
100 100
11
3 6
3 3 100
001
1
5
35
0
100
Explanation:
Test case 
1
1: We can complete mission 
1
1 because it is not a special mission and earn 
1
1 coin, however we do not have sufficient coins to pay the one-time fee to the wizard.

Test case 
2
2: We can complete mission 
2
2 because it is not a special mission and earn 
5
5 coins. We have enough to pay the one-time fee, but then we would actually only make a profit of 
4
4 coins if we pay the one-time fee and then complete mission 
1
1. Hence, we choose not to pay the one-time fee.

accepted
Accepted
2749
total-Submissions
Submissions
4096
accuracy
Accuracy
69.31
 
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes */
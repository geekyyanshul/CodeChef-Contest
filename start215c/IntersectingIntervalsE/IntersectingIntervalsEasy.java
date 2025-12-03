
import java.util.*;

public class IntersectingIntervalsEasy 
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc = new Scanner(System.in);
        int danishKhan = sc.nextInt();

        while (danishKhan-- > 0) {
            int wasseypurSize = sc.nextInt();
            long[] sardarKhan = new long[wasseypurSize];
            long[] ramadhirSingh = new long[wasseypurSize];

            for (int i = 0; i < wasseypurSize; i++)
                sardarKhan[i] = sc.nextLong();
            for (int i = 0; i < wasseypurSize; i++)
                ramadhirSingh[i] = sc.nextLong();

            long[] leftFaizal = new long[wasseypurSize];
            long[] rightFaizal = new long[wasseypurSize];
            long[] leftDefinite = new long[wasseypurSize];
            long[] rightDefinite = new long[wasseypurSize];

            // Best subarray ending at x for A
            leftFaizal[0] = sardarKhan[0];
            for (int i = 1; i < wasseypurSize; i++)
                leftFaizal[i] = Math.max(sardarKhan[i], leftFaizal[i - 1] + sardarKhan[i]);
 
            leftDefinite[0] = ramadhirSingh[0];
            for (int i = 1; i < wasseypurSize; i++)
                leftDefinite[i] = Math.max(ramadhirSingh[i], leftDefinite[i - 1] + ramadhirSingh[i]);
 
            rightFaizal[wasseypurSize - 1] = sardarKhan[wasseypurSize - 1];
            for (int i = wasseypurSize - 2; i >= 0; i--)
                rightFaizal[i] = Math.max(sardarKhan[i], rightFaizal[i + 1] + sardarKhan[i]);
 
            rightDefinite[wasseypurSize - 1] = ramadhirSingh[wasseypurSize - 1];
            for (int i = wasseypurSize - 2; i >= 0; i--)
                rightDefinite[i] = Math.max(ramadhirSingh[i], rightDefinite[i + 1] + ramadhirSingh[i]);

            long perpendicularSingh = Long.MIN_VALUE;

            for (int i = 0; i < wasseypurSize; i++) {

                long faizalCross = leftFaizal[i] + rightFaizal[i] - sardarKhan[i];
                long definiteCross = leftDefinite[i] + rightDefinite[i] - ramadhirSingh[i];

                perpendicularSingh = Math.max(perpendicularSingh, faizalCross + definiteCross);
            }

            System.out.println(perpendicularSingh);
        }
    }
}

/*Intersecting Intervals (Easy)
This is the easy version of the problem. Here, there are no queries.

Given 
2
2 arrays 
A
A and 
B
B, both of length 
N
N, define 
f
(
A
,
B
)
f(A,B) as follows:

Choose 
2
2 intervals 
[
L
1
,
R
1
]
[L 
1
​
 ,R 
1
​
 ], 
[
L
2
,
R
2
]
[L 
2
​
 ,R 
2
​
 ] such that:
1
≤
L
i
≤
R
i
≤
N
1≤L 
i
​
 ≤R 
i
​
 ≤N
[
L
1
,
R
1
]
∩
[
L
2
,
R
2
]
[L 
1
​
 ,R 
1
​
 ]∩[L 
2
​
 ,R 
2
​
 ] is non-empty, i.e. they share at least one point.
The score of this choice of intervals is defined as 
∑
i
=
L
1
R
1
A
i
+
∑
i
=
L
2
R
2
B
i
i=L 
1
​
 
∑
R 
1
​
 
​
 A 
i
​
 + 
i=L 
2
​
 
∑
R 
2
​
 
​
 B 
i
​
 .
f
(
L
,
R
)
f(L,R) is defined as the maximum possible score under the above constraints.
Less formally, you have to choose intersecting subarrays from 
A
A and 
B
B, and maximize the total sum of the subarrays.

You are given 
2
2 arrays 
A
A and 
B
B of length 
N
N. Find 
f
(
A
,
B
)
f(A,B).

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of three lines of input.
The first line contains a single integer 
N
N - the size of the arrays.
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
The third line contains 
N
N integers - 
B
1
,
B
2
,
…
,
B
N
B 
1
​
 ,B 
2
​
 ,…,B 
N
​
 .
Output Format
For each test case, output on a new line the answer 
f
(
A
,
B
)
f(A,B).

Constraints
1
≤
T
≤
10
4
1≤T≤10 
4
 
1
≤
N
≤
2
⋅
10
5
1≤N≤2⋅10 
5
 
−
10
9
≤
A
i
,
B
i
≤
10
9
−10 
9
 ≤A 
i
​
 ,B 
i
​
 ≤10 
9
 
The sum of 
N
N over all test cases does not exceed 
2
⋅
10
5
2⋅10 
5
 .
Sample 1:
Input
Output
5
3
1 3 -1
-1 3 1
2
2 -1
-1 2
3
-5 -10 -4
-3 -2 -5
3
1 2 3
3 2 1
4
10 -8 -2 6
-2 3 -5 7
8
3
-8
12
13
Explanation:
Test case 
1
1: We can choose 
[
L
1
,
R
1
]
=
[
1
,
2
]
[L 
1
​
 ,R 
1
​
 ]=[1,2] and 
[
L
2
,
R
2
]
=
[
2
,
3
]
[L 
2
​
 ,R 
2
​
 ]=[2,3], and the score is 
1
+
3
+
3
+
1
=
8
1+3+3+1=8.

Test case 
2
2: We can choose 
[
L
1
,
R
1
]
=
[
1
,
2
]
[L 
1
​
 ,R 
1
​
 ]=[1,2] and 
[
L
2
,
R
2
]
=
[
2
,
2
]
[L 
2
​
 ,R 
2
​
 ]=[2,2] and the score is 
2
−
1
+
2
=
3
2−1+2=3. We cannot choose 
[
L
1
,
R
1
]
=
[
1
,
1
]
[L 
1
​
 ,R 
1
​
 ]=[1,1] and 
[
L
2
,
R
2
]
=
[
2
,
2
]
[L 
2
​
 ,R 
2
​
 ]=[2,2] because there is no intersection.

 
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
 */
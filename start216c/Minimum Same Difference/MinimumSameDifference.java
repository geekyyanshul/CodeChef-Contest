 
import java.io.*;
import java.lang.*;
import java.util.*;

public class MinimumSameDifference
{
    static final long MOD = 998244353;
    static final int MAX = 200005;

    static long[] fact = new long[MAX];
    static long[] invFact = new long[MAX];

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        precompute();

        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                out.println(solve(N, K));
            }
        }

        out.flush();
        sc.close();
    }

    static long solve(int N, int K) {
        long distinctOnly = nPr(K, N);
        long result = 0;

        for (int d = 1; d <= N; d++) {
            long count = 0;

            if (d - 1 <= K) {
                long prefix = nPr(K, d - 1);
                long choices = K - (d - 1);
                long remaining = N - (d - 1);
                long powVal = modPow(choices, remaining);
                count = (prefix * powVal) % MOD;
            }

            long add = (count - distinctOnly + MOD) % MOD;
            result = (result + add) % MOD;
        }

        return result;
    }

    static void precompute() {
        fact[0] = invFact[0] = 1;

        for (int i = 1; i < MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        invFact[MAX - 1] = modPow(fact[MAX - 1], MOD - 2);

        for (int i = MAX - 2; i >= 1; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    static long nPr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (fact[n] * invFact[n - r]) % MOD;
    }

    static long modPow(long base, long exp) {
        long ans = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) ans = (ans * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return ans;
    }
}


/*Minimum Same Difference
For an array 
A
A of size 
N
N, we define 
f
(
A
)
f(A) as follows:

If 
A
A contains 
N
N distinct elements, 
f
(
A
)
=
0
f(A)=0.
Otherwise, 
f
(
A
)
=
min
⁡
(
j
−
i
)
f(A)=min(j−i) among all pairs 
(
i
,
j
)
(i,j) satisfying 
1
≤
i
<
j
≤
N
1≤i<j≤N and 
A
i
=
A
j
A 
i
​
 =A 
j
​
 .
You are given 
2
2 integers 
N
N and 
K
K.

Your task is to find the sum of 
f
(
A
)
f(A) over all arrays 
A
A of size 
N
N satisfying 
1
≤
A
i
≤
K
1≤A 
i
​
 ≤K. Since the answer may be large, print it modulo 
998244353
998244353.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line of input contains 
2
2 integers - 
N
N and 
K
K.
Output Format
For each test case, output on a new line the sum of 
f
(
A
)
f(A) over all arrays 
A
A of size 
N
N and 
1
≤
A
i
≤
K
1≤A 
i
​
 ≤K modulo 
998244353
998244353.

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
,
K
≤
2
⋅
10
5
1≤N,K≤2⋅10 
5
 
The sum of 
N
N and the sum of 
K
K over all test cases does not exceed 
2
⋅
10
5
2⋅10 
5
 
Sample 1:
Input
Output
5
2 1
2 2
3 2
1 5
343 420
1
2
10
0
83790949
Explanation:
Test Case 1 : There is only one array 
A
=
[
1
,
1
]
A=[1,1], and this has 
f
(
A
)
=
1
f(A)=1 corresponding to the pair 
(
i
,
j
)
=
(
1
,
2
)
(i,j)=(1,2).

Test Case 2 : There are 
4
4 arrays. 
2
2 of them, i.e. 
[
1
,
2
]
[1,2] and 
[
2
,
1
]
[2,1], have 
f
(
A
)
=
0
f(A)=0 due to all elements distinct. The other 
2
2 arrays 
[
1
,
1
]
[1,1] and 
[
2
,
2
]
[2,2] have 
f
(
A
)
=
1
f(A)=1.

accepted
Accepted
256
total-Submissions
Submissions
421
accuracy
Accuracy
63.42
Did you like the problem statement?
10 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
 */
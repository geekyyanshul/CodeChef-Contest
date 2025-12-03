import java.io.*;
import java.util.*;

class CodeChef {
    static class Faizal {
        BufferedReader br;
        StringTokenizer st;

        public Faizal() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            String s = next();
            return (s == null) ? 0 : Integer.parseInt(s);
        }

        long nextLong() {
            String s = next();
            return (s == null) ? 0 : Long.parseLong(s);
        }
    }

    static class Sardar {
        long sA, pA, suA, subA;
        long sB, pB, suB, subB;
        long Ramadhir;
        long cAp, cAs;
        long cBp, cBs;
        long xPasB, xSapB;
        public Sardar() {}
    }

    static Sardar[] Sultan;
    static int Dhanbad;
    static long[] Danish, Perpendicular;
    static final long INF = (long)1e16;

    public static void main(String[] args) throws Exception {
        Faizal sc = new Faizal();
        String s = sc.next();
        if (s == null) return;
        int T = Integer.parseInt(s);
        
        while (T-- > 0) {
            Dhanbad = sc.nextInt();
            int Q = sc.nextInt();

            Danish = new long[Dhanbad + 1];
            Perpendicular = new long[Dhanbad + 1];

            for (int i = 1; i <= Dhanbad; i++) Danish[i] = sc.nextLong();
            for (int i = 1; i <= Dhanbad; i++) Perpendicular[i] = sc.nextLong();

            Sultan = new Sardar[4 * Dhanbad + 1];
            Shakeel(1, 1, Dhanbad);

            StringBuilder sb = new StringBuilder();
            while (Q-- > 0) {
                int type = sc.nextInt();
                if (type == 1) {
                    int Durga = sc.nextInt();
                    long x = sc.nextLong();
                    long y = sc.nextLong();
                    Tangent(1, 1, Dhanbad, Durga, x, y);
                } else {
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    Sardar res = Shamshad(1, 1, Dhanbad, l, r);
                    sb.append(res.Ramadhir).append("\n");
                }
            }
            System.out.print(sb);
        }
    }

    static Sardar Definite(Sardar L, Sardar R) {
        Sardar res = new Sardar();

        res.sA = L.sA + R.sA;
        res.pA = Math.max(L.pA, L.sA + R.pA);
        res.suA = Math.max(R.suA, R.sA + L.suA);
        res.subA = Math.max(Math.max(L.subA, R.subA), L.suA + R.pA);

        res.sB = L.sB + R.sB;
        res.pB = Math.max(L.pB, L.sB + R.pB);
        res.suB = Math.max(R.suB, R.sB + L.suB);
        res.subB = Math.max(Math.max(L.subB, R.subB), L.suB + R.pB);

        res.xPasB = Math.max(L.sA + R.pA + L.suB + R.sB,
                    Math.max(L.sA + R.xPasB, L.xPasB + R.sB));

        res.xSapB = Math.max(L.suA + R.sA + L.sB + R.pB,
                    Math.max(R.sA + L.xSapB, L.sB + R.xSapB));

        long t1 = Math.max(L.cAp, L.sA + R.cAp);
        long t2 = Math.max(L.sA + R.pA + L.subB, L.sA + R.pA + L.suB + R.pB);
        long t3 = L.xPasB + R.pB;
        res.cAp = Math.max(t1, Math.max(t2, t3));

        t1 = Math.max(R.cAs, R.sA + L.cAs);
        t2 = Math.max(L.suA + R.sA + R.subB, L.suA + R.sA + L.suB + R.pB);
        t3 = L.suB + R.xSapB;
        res.cAs = Math.max(t1, Math.max(t2, t3));

        t1 = Math.max(L.cBp, L.sB + R.cBp);
        t2 = Math.max(L.sB + R.pB + L.subA, L.sB + R.pB + L.suA + R.pA);
        t3 = L.xSapB + R.pA;
        res.cBp = Math.max(t1, Math.max(t2, t3));

        t1 = Math.max(R.cBs, R.sB + L.cBs);
        t2 = Math.max(L.suB + R.sB + R.subA, L.suB + R.sB + L.suA + R.pA);
        t3 = L.suA + R.xPasB;
        res.cBs = Math.max(t1, Math.max(t2, t3));

        long crossAns = L.suA + R.pA + L.suB + R.pB;
        long aCross = Math.max(L.cAs + R.pA, L.suA + R.cAp);
        long bCross = Math.max(L.cBs + R.pB, L.suB + R.cBp);

        res.Ramadhir = Math.max(Math.max(L.Ramadhir, R.Ramadhir),
                       Math.max(crossAns, Math.max(aCross, bCross)));

        return res;
    }

    static void Shakeel(int Shafi, int Asgar, int Iqbal) {
        if (Asgar == Iqbal) {
            Sultan[Shafi] = new Sardar();
            long Sabir = Danish[Asgar];
            long Gullu = Perpendicular[Asgar];

            Sultan[Shafi].sA = Sultan[Shafi].pA = Sultan[Shafi].suA = Sultan[Shafi].subA = Sabir;
            Sultan[Shafi].sB = Sultan[Shafi].pB = Sultan[Shafi].suB = Sultan[Shafi].subB = Gullu;
            Sultan[Shafi].Ramadhir = Sabir + Gullu;
            Sultan[Shafi].cAp = Sultan[Shafi].cAs = Sabir + Gullu;
            Sultan[Shafi].cBp = Sultan[Shafi].cBs = Sabir + Gullu;
            Sultan[Shafi].xPasB = Sultan[Shafi].xSapB = Sabir + Gullu;
            return;
        }
        int Nagma = (Asgar + Iqbal) / 2;
        Shakeel(2 * Shafi, Asgar, Nagma);
        Shakeel(2 * Shafi + 1, Nagma + 1, Iqbal);
        Sultan[Shafi] = Definite(Sultan[2 * Shafi], Sultan[2 * Shafi + 1]);
    }

    static void Tangent(int Shafi, int Asgar, int Iqbal,
                        int Durga, long valA, long valB) {
        if (Asgar == Iqbal) {
            long Sabir = valA;
            long Gullu = valB;
            Sultan[Shafi].sA = Sultan[Shafi].pA = Sultan[Shafi].suA = Sultan[Shafi].subA = Sabir;
            Sultan[Shafi].sB = Sultan[Shafi].pB = Sultan[Shafi].suB = Sultan[Shafi].subB = Gullu;
            Sultan[Shafi].Ramadhir = Sabir + Gullu;
            Sultan[Shafi].cAp = Sultan[Shafi].cAs = Sabir + Gullu;
            Sultan[Shafi].cBp = Sultan[Shafi].cBs = Sabir + Gullu;
            Sultan[Shafi].xPasB = Sultan[Shafi].xSapB = Sabir + Gullu;
            return;
        }
        int Nagma = (Asgar + Iqbal) / 2;
        if (Durga <= Nagma)
            Tangent(2 * Shafi, Asgar, Nagma, Durga, valA, valB);
        else
            Tangent(2 * Shafi + 1, Nagma + 1, Iqbal, Durga, valA, valB);
        Sultan[Shafi] = Definite(Sultan[2 * Shafi], Sultan[2 * Shafi + 1]);
    }

    static Sardar Shamshad(int Shafi, int Asgar, int Iqbal, int l, int r) {
        if (r < Asgar || Iqbal < l) return null;
        if (l <= Asgar && Iqbal <= r) return Sultan[Shafi];
        int Nagma = (Asgar + Iqbal) / 2;
        Sardar p1 = Shamshad(2 * Shafi, Asgar, Nagma, l, r);
        Sardar p2 = Shamshad(2 * Shafi + 1, Nagma + 1, Iqbal, l, r);
        if (p1 == null) return p2;
        if (p2 == null) return p1;
        return Definite(p1, p2);
    }
}
/*Intersecting Intervals (Hard)
This is the hard version of the problem. Here, there are updates to the array and queries.

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
N. There are 
Q
Q events, of 
2
2 types:

Updates: You are given 
3
3 integers 
P
P, 
X
X and 
Y
Y, and you should update 
A
P
A 
P
​
  to 
X
X and 
B
P
B 
P
​
  to 
Y
Y.
Queries: You are given 
2
2 integers 
L
L and 
R
R, and you should find 
f
(
A
[
L
,
R
]
,
B
[
L
,
R
]
)
f(A[L,R],B[L,R]) where 
A
[
L
,
R
]
A[L,R] denotes the subarray 
[
A
L
,
A
L
+
1
,
A
L
+
2
,
…
,
A
R
]
[A 
L
​
 ,A 
L+1
​
 ,A 
L+2
​
 ,…,A 
R
​
 ].
Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains 
2
2 integers - 
N
N and 
Q
Q, the size of the arrays and the number of events.
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
The next 
Q
Q lines each describe an event, first you are given a integer 
type
type denoting the type of the event.
If 
type
=
1
type=1, you are given 
3
3 integers 
P
P, 
X
X and 
Y
Y; describing an update.
If 
type
=
2
type=2, you are given 
2
2 integers 
L
L and 
R
R; describing a query.
Output Format
For each test case, for each query, output the value of 
f
(
A
[
L
,
R
]
,
B
[
L
,
R
]
)
f(A[L,R],B[L,R]).

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
Q
≤
1.5
⋅
10
5
1≤N,Q≤1.5⋅10 
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
 
1
≤
type
≤
2
1≤type≤2
For all updates, 
1
≤
P
≤
N
1≤P≤N and 
−
10
9
≤
X
,
Y
≤
10
9
−10 
9
 ≤X,Y≤10 
9
 
For all queries, 
1
≤
L
≤
R
≤
N
1≤L≤R≤N.
The sum of 
N
N and the sum of 
Q
Q over all test cases both do not exceed 
1.5
⋅
10
5
1.5⋅10 
5
 .
Sample 1:
Input
Output
5
3 5
1 3 -1
-1 3 1
2 1 3
2 2 2
1 2 -2 -5
2 1 3
2 2 2
2 4
2 -1
-1 2
2 1 2
2 2 2
1 1 5 10
2 1 2
3 1
-5 -10 -4
-3 -2 -5
2 1 3
3 1
1 2 3
3 2 1
2 1 3
4 1
10 -8 -2 6
-2 3 -5 7
2 1 4
8
6
0
-7
3
1
17
-8
12
13
Explanation:
Test case 
1
1:

Event 
1
1, Query: We can choose 
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

Event 
2
2, Query: We need to solve for the range 
[
L
,
R
]
=
[
2
,
2
]
[L,R]=[2,2], i.e. the corresponding subarrays are 
[
3
]
[3] and 
[
3
]
[3]. Here we choose 
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
1
,
1
]
[L 
2
​
 ,R 
2
​
 ]=[1,1] to get a sum of 
6
6.

Event 
3
3, Update: 
A
A is updated to 
[
1
,
−
2
,
−
1
]
[1,−2,−1] and 
B
B is updated to 
[
−
1
,
−
5
,
1
]
[−1,−5,1].

Event 
4
4, Query: We can choose 
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
1
,
1
]
[L 
2
​
 ,R 
2
​
 ]=[1,1] which gets 
1
+
(
−
1
)
=
0
1+(−1)=0. It is not possible to get a better sum after the update.

 
More Info
Time limit6 secs
Memory limit1.5 GB
Source Limit50000 Bytes */
 
import java.lang.*;
import java.util.*;
public class XOREqualSubtract  

{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc  = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int testCases = sc.nextInt();
            
            while (testCases-- > 0) {
                
                int size = sc.nextInt();
                int[] numbers = new int[size];
                
                for (int i = 0; i < size; i++) {
                    numbers[i] = sc.nextInt();
                }
                
                Arrays.sort(numbers);
                
                int[] longestChain = new int[size];
                int answer = 0;
                
                if (size > 0) answer = 1;
                
                for (int current = 0; current < size; current++) {
                    
                    longestChain[current] = 1;
                    
                    for (int previous = 0; previous < current; previous++) {
                        if ((numbers[previous] & numbers[current]) == numbers[previous]) {
                            longestChain[current] = Math.max(
                                longestChain[current],
                                longestChain[previous] + 1
                            );
                        }
                    }
                    
                    answer = Math.max(answer, longestChain[current]);
                }
                
                System.out.println(answer);
            }
        }
    }
}
/*Scored
05
Min
16
Sec
XOR Equal Subtract
An array 
A
A is called good if the following condition is satisfied:

For all pairs 
(
i
,
j
)
(i,j) such that 
1
≤
i
<
j
≤
∣
A
∣
1≤i<j≤∣A∣, 
A
i
⊕
A
j
=
∣
A
i
−
A
j
∣
A 
i
​
 ⊕A 
j
​
 =∣A 
i
​
 −A 
j
​
 ∣, where 
⊕
⊕ represents the Bitwise XOR operator.
You are given an array 
A
A of 
N
N integers. Find the maximum size of a good subsequence of 
A
A.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains a single integer 
N
N.
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
For each test case, output the maximum size of a good subsequence of 
A
A.

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
<
2
30
1≤A 
i
​
 <2 
30
 
Sample 1:
Input
Output
4
4
3 1 2 1
3
102 102 102
4
8 16 32 64
5
3 11 1 11 15
3
3
1
5
Explanation:
Test Case 1 : We can choose the subsequence 
[
3
,
1
,
1
]
[3,1,1]. It can be verified this is good in the following way:

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
(i,j)=(1,2) : 
A
i
⊕
A
j
=
2
=
∣
A
i
−
A
j
∣
A 
i
​
 ⊕A 
j
​
 =2=∣A 
i
​
 −A 
j
​
 ∣
(
i
,
j
)
=
(
1
,
3
)
(i,j)=(1,3) : 
A
i
⊕
A
j
=
2
=
∣
A
i
−
A
j
∣
A 
i
​
 ⊕A 
j
​
 =2=∣A 
i
​
 −A 
j
​
 ∣
(
i
,
j
)
=
(
2
,
3
)
(i,j)=(2,3) : 
A
i
⊕
A
j
=
0
=
∣
A
i
−
A
j
∣
A 
i
​
 ⊕A 
j
​
 =0=∣A 
i
​
 −A 
j
​
 ∣ */
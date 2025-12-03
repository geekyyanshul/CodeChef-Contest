import java.lang.*;
import java.util.*;

class differingValues
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String danish = sc.next();  

            int faizal = 0;  
            for (char c : danish.toCharArray()) {
                if (c == '0') faizal++;
            }

            int sardar = n - faizal;  

            int ramadhir = n / k;    
            int definite = n % k;    

            int perpendicular = 0;   

            perpendicular += definite * ((ramadhir + 1 + 1) / 2);
            perpendicular += (k - definite) * ((ramadhir + 1) / 2);

            if (faizal <= perpendicular && sardar <= perpendicular) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
/*Differing Values
You are given a binary string 
S
S of size 
N
N, and a parameter 
K
K.

You are wondering whether it is possible to rearrange the characters in 
S
S such that the following condition is satisfied:

S
i
≠
S
i
+
K
S 
i
​
 =S 
i+K
​
  for all 
1
≤
i
≤
N
−
K
1≤i≤N−K
Print 
Yes
Yes if it is possible to rearrange 
S
S in such a way, and 
No
No otherwise.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains 
2
2 space-separated integers - 
N
N and 
K
K.
The second line contains a binary string 
S
S.
Output Format
For each test case, output on a new line 
Yes
Yes if it is possible to rearrange the binary string accordingly and 
No
No otherwise.

You may output each character in either case, for example 
YES
YES, 
yes
yes and 
yES
yES will all be accepted as a positive response.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
K
<
N
≤
100
1≤K<N≤100
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
4
4 1
1010
4 3
1001
4 1
1111
4 2
1110
Yes
Yes
No
No
Explanation:
Test case 
1
1: The given string is already valid as 
S
1
≠
S
2
S 
1
​
 =S 
2
​
 , 
S
2
≠
S
3
S 
2
​
 =S 
3
​
  and 
S
3
≠
S
4
S 
3
​
 =S 
4
​
 .

Test case 
2
2: A valid rearrangement is 
1010
1010. The only condition required was 
S
1
≠
S
4
S 
1
​
 =S 
4
​
 .

Did you like the problem statement?
36 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes */
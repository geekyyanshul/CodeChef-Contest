import java.lang.*;
import java.util.*;

class aborc
{
	static class jethalalNode {
		int dayaValue;
		int tappuIndex;
		
		jethalalNode(int v, int i) {
			dayaValue = v;
			tappuIndex = i;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner babitaScanner = new Scanner(System.in);
		
		int abdulTests = babitaScanner.nextInt();
		
		while (abdulTests-- > 0)
		{
			int gokuldhamSize = babitaScanner.nextInt();
			
			List<jethalalNode> bhideList = new ArrayList<>();
			
			for (int i = 0; i < gokuldhamSize; i++)
			{
				int aiyarA = babitaScanner.nextInt();
				int sodhiB = babitaScanner.nextInt();
				int popatlalC = babitaScanner.nextInt();
				
				bhideList.add(new jethalalNode(aiyarA, i));
				bhideList.add(new jethalalNode(sodhiB, i));
				bhideList.add(new jethalalNode(popatlalC, i));
			}
			
			// Sort by value
			Collections.sort(bhideList, (x, y) -> x.dayaValue - y.dayaValue);
			
			int[] champakCount = new int[gokuldhamSize];
			int tappuCovered = 0;
			
			int goliLeft = 0;
			int finalAnswer = Integer.MAX_VALUE;
			
			for (int pinkuRight = 0; pinkuRight < bhideList.size(); pinkuRight++)
			{
				jethalalNode rightNode = bhideList.get(pinkuRight);
				
				if (champakCount[rightNode.tappuIndex] == 0)
					tappuCovered++;
				
				champakCount[rightNode.tappuIndex]++;
				
 
				while (tappuCovered == gokuldhamSize)
				{
					jethalalNode leftNode = bhideList.get(goliLeft);
					
					int currentRange = rightNode.dayaValue - leftNode.dayaValue;
					finalAnswer = Math.min(finalAnswer, currentRange);
					
					champakCount[leftNode.tappuIndex]--;
					if (champakCount[leftNode.tappuIndex] == 0)
						tappuCovered--;
					
					goliLeft++;
				}
			}
			
			System.out.println(finalAnswer);
		}
	}
}
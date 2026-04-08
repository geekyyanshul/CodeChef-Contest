import java.lang.*;
import java.util.*;

class kmedian
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int doraemonTests = sc.nextInt();
		
		while (doraemonTests-- > 0)
		{
			int shinchanSize = sc.nextInt();
			int ninjaDeletes = sc.nextInt();
			
			int[] pikachuArray = new int[shinchanSize];
			
			for (int tom = 0; tom < shinchanSize; tom++)
			{
				pikachuArray[tom] = sc.nextInt();
			}
			
			Arrays.sort(pikachuArray);
			
			int doremiRemaining = shinchanSize - ninjaDeletes;
			int nobitaMedianPos = (doremiRemaining + 1) / 2;
			
			int gokuStart = nobitaMedianPos - 1;
			int luffyEnd = gokuStart + ninjaDeletes;
			
			int lastPrinted = -1;
			
			for (int batman = gokuStart; batman <= luffyEnd; batman++)
			{
				if (batman == gokuStart || pikachuArray[batman] != lastPrinted)
				{
					System.out.print(pikachuArray[batman] + " ");
					lastPrinted = pikachuArray[batman];
				}
			}
			System.out.println();
		}
	}
}
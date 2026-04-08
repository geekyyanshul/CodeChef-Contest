    import java.lang.*;
    import java.util.*;
    
    class medianUpdates
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int abdulTests = sc.nextInt();
            
            while (abdulTests-- > 0)
            {
                int gokuldhamSize = sc.nextInt();
                String jethalalString = sc.next();
                
                boolean tappuArmy = true;
                for (int i = 0; i < gokuldhamSize; i++)
                {
                    if (jethalalString.charAt(i) == jethalalString.charAt((i + 1) % gokuldhamSize))
                    {
                        tappuArmy = false;
                        break;
                    }
                }
                
                if (tappuArmy)
                {
                    System.out.println(-1);
                    continue;
                }
                
                int goliMaxLen = 0;
                int pinkuCurrent = 1;
                
                for (int sodhi = 1; sodhi < 2 * gokuldhamSize; sodhi++)
                {
                    if (jethalalString.charAt(sodhi % gokuldhamSize) != 
                        jethalalString.charAt((sodhi - 1) % gokuldhamSize))
                    {
                        pinkuCurrent++;
                    }
                    else
                    {
                        goliMaxLen = Math.max(goliMaxLen, pinkuCurrent);
                        pinkuCurrent = 1;
                    }
                }
                
                goliMaxLen = Math.max(goliMaxLen, pinkuCurrent);
                
                int finalAnswer = (goliMaxLen - 1) / 2 + 1;
                System.out.println(finalAnswer);
            }
        }
    }
public class TestRandom {
            public static void main( String []args)
            {
                int runTimes = Integer.parseInt(args[0]);
                int small=0,big=0;
                for(int i=0;i<runTimes;i++)
                {
                    if(Math.random()>0.5)
                        big++;
                    else    
                        small++;    
                }
                System.out.println("> 0.5: "+big+" times");
                System.out.println("<= 0.5: "+small+" times");
                if(small!=0)
                    System.out.println((double)(big)/small);

            }


}

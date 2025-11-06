public class Collatz {
    public static void main(String [] args)
    {
        int seed = 0;
        int count=1;
        int n = Integer.parseInt(args[0]);
        if(args[1].charAt(0)=='v')
        {
        for(int i=1;i<= n;i++)
        {
         seed = i;
         count=1;

        if(seed ==1)
        {
             System.out.print(seed+" ");
            seed=4;
            count++;
        }
        while(seed!=1&& count<20)
        {
            System.out.print(seed+" ");
            if(seed%2==0)
            {
                seed/=2;
            }
            else
            {
                seed=seed*3+1;
            }
            
            count++;
        }
        System.out.print(seed+" ");
        System.out.print("("+count+")");
        System.out.println();
        }
    }
        System.out.println("Every one of the first "+ n+ " hailstone sequences reached 1.");

    }

}

public class CalcPi {
    public static void main(String []args)
    {
        double mehane = 1;
        double pi = 0;
        for(int i = 0;i<Integer.parseInt(args[0]);i++)
        {
            if(i%2==0)
            {
                pi+=(1/mehane);
            }
            else
            {
                pi-=(1/mehane);
            }
            mehane+=2;
        }
        System.out.println("pi according to Java: "+ Math.PI);
        System.out.println("pi, approxmated:      "+pi*4);
    }

}

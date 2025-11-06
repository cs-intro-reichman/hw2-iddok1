public class Cheers {
    public static void main( String []args)
    {
        String str = ""+args[0];
        int n = Integer.parseInt(args[1]);
        char c=0;
        String ch = "AEFHILMNORSX";
        String caps="";
        for(int i=0; i<str.length();i++)
        {
            c = str.charAt(i);
            
            if((int)str.charAt(i)>96)
            {
                c = (char)((int)(str.charAt(i))-32);
            }
            caps +=c;
            if(ch.indexOf(c)!=-1)
            {
                System.out.println("give me an "+c+ ": "+c+"!");
            }
            else
            {
                System.out.println("give me a  "+c+ ": "+c+"!");
            }
        }
            System.out.println("what does that spell?");
            for(int i=0;i<n;i++)
            {
                System.out.println(caps +"!!!");
            }
            
    }
    
}

public class TimeCalc {
        public static void main( String []args)
        {
            int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		    int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
            int minutesToAdd = Integer.parseInt(args[1]);
            int totalMin = hours*60 + minutes + minutesToAdd;
            int totalHours = totalMin/60;
            int newHours = totalHours%24;
            int newMin = totalMin%60;
            String strHours = ""+ newHours;
            if(newHours<10)
            {
                strHours = "0"+ strHours;
            }
            String strMin = ""+ newMin;
            if(newMin<10)
            {
                strMin = "0"+ strMin;
            }
            System.out.println(strHours+":"+strMin);
        }
    	
}

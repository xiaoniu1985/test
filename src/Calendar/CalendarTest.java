package Calendar;

import java.util.Calendar;

public class CalendarTest {
	
	 public static void main(String[] args) {
			 Calendar cal=Calendar.getInstance();
			 System.out.println("kkk");
		     cal.set(2017,4,14);
		     System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		     cal.set(2017, 5, 1);
	         cal.add(Calendar.DATE, -1);
		     System.out.println(cal.get(Calendar.DATE));
		     System.out.println(cal.get(Calendar.DATE));
	 }
}

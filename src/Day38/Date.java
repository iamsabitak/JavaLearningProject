package Day38;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        System.out.println("Number of millisecond since 1970 " + System.currentTimeMillis());
        System.out.println("Number of second since 1970 " + System.currentTimeMillis()/1000);
        System.out.println("Number of hours since 1970 " + System.currentTimeMillis()/1000/3600);
        System.out.println("Number of Days since 1970 " + System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number of years since 1970 " + System.currentTimeMillis()/1000/3600/24/365);

        //Problem no 1
// Date d = new Date();
// System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

// Problem no 2
Calendar c = Calendar. getInstance ();
System.out.println(c.get (Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    
      //Problem no 3
      LocalDateTime dt = LocalDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); 
    String mydate = dt.format(df);
    System.out.println(mydate);
        
    }
}

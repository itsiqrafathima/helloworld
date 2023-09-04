import java.util.Date;
import java.util.*;
import java.text.*;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date todate = new Date();
		System.out.println(todate.toString());
		// Printing date using simple format
		SimpleDateFormat ft =  new SimpleDateFormat ("dd.MM.yyyy E 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(todate));
	}

}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OperationCalendar {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Calendar calendar = new GregorianCalendar(2018,0,26);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		calendar.add(Calendar.DAY_OF_MONTH, -60);
		System.out.println("Date : " + sdf.format(calendar.getTime()));
	}
}
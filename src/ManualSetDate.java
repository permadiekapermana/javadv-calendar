import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ManualSetDate {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		System.out.println("#1. " + sdf.format(calendar.getTime()));
		
		calendar.set(Calendar.YEAR, 2018);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 26);
		calendar.set(Calendar.MINUTE, 33);
		System.out.println("#2. " + sdf.format(calendar.getTime()));
	}
}
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToCalendar {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "26-01-2018 17:00:56";
		Date date = sdf.parse(dateInString);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(date);
	}
}

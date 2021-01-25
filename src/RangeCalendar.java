import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RangeCalendar {
    public static String selisihDate(Date waktuSatu, Date waktuDua) {
        long selisihMS = Math.abs(waktuSatu.getTime() – waktuDua.getTime());
        long selisihHari = selisihMS / (24 * 60 * 60 * 1000);
        String selisih = selisihHari + " hari " ;
        return selisih;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdfdate = new SimpleDateFormat("dd-MM-yyyy");
        Date tanggal = new Date();
        System.out.println("Sekarang Tanggal : " + sdfdate.format(tanggal));
                
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 5);
        Date limaharilagi = cal.getTime();
        System.out.println("Lima Hari Lagi Tanggal:"+ sdfdate.format(limaharilagi));
        String hasilSelisih = SelisihDateTime.selisihDate(tanggal,limaharilagi);
        System.out.println("Hasil Selisih Harinya Adalah   : "+ (hasilSelisih));       
    }
}
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        Date date = new Date();
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
 
        f.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.format(f.format(date));
    }
}
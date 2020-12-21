import java.util.*;
import java.time.*;
import java.text.*;

public class Entry {
    Scanner scan = new Scanner(System.in);
    Calendar c = Calendar.getInstance();
    Calendar cal = Calendar.getInstance();
    String question;
    String gratefulDescription;
    String ask;
    String pattern;
    String todayAsString;
    Date today;
    Date date;
    String day;
    DateFormat df;
    String ty;
    protected String collectGratitude(String day, String today) {
        System.out.println("What are you grateful for on "+day+", "+today+"?");
        gratefulDescription = scan.nextLine();
        ty = "Thank you for inputting your gratitude! <3";
        return ty;
    }
    protected String getTodaysDate() {
        pattern = "MM/dd/yyyy";
        df = new SimpleDateFormat(pattern);
        today = Calendar.getInstance().getTime();
        todayAsString = df.format(today);
        return todayAsString;
    }
    protected String getDay() {
        date = c.getTime();
        day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        return day;
    }
}

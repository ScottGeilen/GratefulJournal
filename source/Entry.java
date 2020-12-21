import java.util.*;
import java.time.*;
import java.text.*;

public class Entry {
    public String todaysDate() {
        String pattern = "MM/dd/yyyy";
        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String todayAsString = df.format(today);
        return(todayAsString);
    }
    public String getDay() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        return(day);
    }
    public String question(String date) {
        String ask = "What are you grateful for on "+getDay()+", "+todaysDate()+"?";
        return(ask);
    }
}

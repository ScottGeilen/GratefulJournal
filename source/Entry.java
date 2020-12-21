import java.util.*;
import java.time.*;
import java.text.*;

public class Entry {
    public String todaysDate() {
        String pattern = "MM/dd/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String todayAsString = df.format(today);
        return(todayAsString);
    }
    public String gratefulTextInput(String date) {
        Scanner scan = new Scanner(System.in);
        String ask = "What are you grateful for on "+todaysDate()+"?";
        return(ask);
    }
}

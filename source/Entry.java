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
    protected String getInput(String day, String today) {
        question = askQuestion(day, today);
        gratefulDescription = scan.nextLine();
        return gratefulDescription;
    }
    protected String askQuestion(String day, String today) {
        ask = "What are you grateful for on "+day+", "+today+"?";
        return ask;
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

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

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
    String todaysDate;
    protected String collectGratitude(String date) {
        System.out.println("What are you grateful for on "+date+"?");
        gratefulDescription = scan.nextLine();
        ty = "Thank you for inputting your gratitude! <3";
        initialWriteToCSV(date, gratefulDescription);
        return ty;
    }
    protected void initialWriteToCSV(String date, String des) {
        List<List<String>> rows = Arrays.asList(Arrays.asList(date, des));
        try {
            FileWriter csvWriter = new FileWriter("docs/2021-entries.csv");
            csvWriter.append("Day");
            csvWriter.append(",");
            csvWriter.append("Date");
            csvWriter.append(",");
            csvWriter.append("Grateful for");
            csvWriter.append("\n");
            for (List<String> rowData : rows) {
                csvWriter.append(String.join(",", rowData));
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }      
    }
    protected String getTodaysDate() {
        date = c.getTime();
        day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        pattern = "MM/dd/yyyy";
        df = new SimpleDateFormat(pattern);
        today = Calendar.getInstance().getTime();
        todayAsString = df.format(today);
        todaysDate = ""+day+", "+todayAsString;
        return todaysDate;
    }
}

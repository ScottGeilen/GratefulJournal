import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        source();
    }
    public static void source() {
        Scanner scan = new Scanner(System.in);
        Entry entry = new Entry();
        System.out.println(entry.askQuestion(entry.getTodaysDate()));
    }
}
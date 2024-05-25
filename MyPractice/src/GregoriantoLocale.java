import java.time.LocalDate;
import java.util.GregorianCalendar;

public class GregoriantoLocale {

    public static void main(String[] args) {
        // Assuming you have these variables
        int aYear = 2022;
        int aMonth = 3;  // Assuming March (aMonth - 1)
        int aDay = 15;

        // Using GregorianCalendar
        GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
        java.util.Date hireDay = cal.getTime();
        System.out.println("Date using GregorianCalendar: " + hireDay);

        // Convert to LocalDate
        LocalDate localDate = convertToLocalDate(cal);
        System.out.println("Converted to LocalDate: " + localDate);
    }

    // Method to convert GregorianCalendar to LocalDate
    private static LocalDate convertToLocalDate(GregorianCalendar calendar) {
        return LocalDate.of(calendar.get(GregorianCalendar.YEAR),
                             calendar.get(GregorianCalendar.MONTH) + 1,
                             calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

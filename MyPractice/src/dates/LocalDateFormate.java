package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormate{

    public static void main(String[] args) {
        // Assuming you have a LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Original Date: " + currentDate);

        //Define a custom date format
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the LocalDate using the custom format
        String formattedDate = currentDate.format(customFormat);
        System.out.println("Formatted Date: " + formattedDate);
    }
}

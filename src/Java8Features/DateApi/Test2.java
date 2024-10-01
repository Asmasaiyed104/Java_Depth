package Java8Features.DateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {
    public static void main(String[] args) {
       // years-month-date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ld1 = LocalDate.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String current_date = ld1.format(dft);
        System.out.println(current_date);

        String selected_date = "01-01-2024";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld2 = LocalDate.parse(selected_date,dateTimeFormatter);
        System.out.println(ld2);
    }
}

package Java8Features.DateApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date d = new Date();
        //MM is for month
        // mm is for minute
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        String current_date = simpleDateFormat.format(d);

        System.out.println(current_date);

        // HH represent 24 hrs
        // hh represnt 12 hrs

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss");
        String current_time = simpleDateFormat1.format(d);
        System.out.println(current_time);
    }
}

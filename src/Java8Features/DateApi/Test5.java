package Java8Features.DateApi;

import java.time.LocalTime;
import java.time.ZoneId;

public class Test5 {
    public static void main(String[] args) {
        ZoneId zd = ZoneId.of("America/Toronto");
        LocalTime lt = LocalTime.now(zd);
        System.out.println(lt);
    }
}

package Java8Features.DateApi;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Asma
 */

class AgeCalculator
{
    static public void calculateAge(LocalDate dob, LocalDate todaydate)
    {
        Period p=Period.between(dob, todaydate);
        System.out.println(p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
    }
}
public class Test7
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Date : ");
        int date=s.nextInt();

        System.out.println("Enter Month : ");
        int month=s.nextInt();

        System.out.println("Enter Year : ");
        int year=s.nextInt();

        LocalDate ld1=LocalDate.of(year, month, date);

        LocalDate ld2=LocalDate.now();

        AgeCalculator.calculateAge(ld1, ld2);
    }
}

package JavaInterviewCodingPractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int leapYear = sc.nextInt();

        System.out.println("Input :" + leapYear);
        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || (leapYear % 400 == 0)) {
            System.out.println("Output: Leap year");
        } else {
            System.out.println("Output: Not a leap year");
        }
    }
}

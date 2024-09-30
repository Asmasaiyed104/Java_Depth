package JavaInterviewCodingPractice;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++)
        {
            sum += i;
        }
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);

    }
}

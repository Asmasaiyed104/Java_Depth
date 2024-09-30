package JavaInterviewCodingPractice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        System.out.println("Input :" + i );

       if (i %2 ==1){

           System.out.println("Output:"+ "Odd");
       }else {
           System.out.println("Output:"+ "Even");
       }

    }
}

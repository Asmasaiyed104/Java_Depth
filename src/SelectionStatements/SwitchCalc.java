package SelectionStatements;

import java.util.Scanner;

public class SwitchCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Enter number 1");
        int no1 = sc.nextInt();
        System.out.println("Enter number 2");
        int no2 = sc.nextInt();
        System.out.println("performed +, -, *,%,/");
        char res = sc.next().charAt(0);

        switch(res){
            case '+' :
                System.out.println(no1+no2);
                break;
            case'-':
                System.out.println(no1-no2);
                break;
            case'/':
                System.out.println(no1/no2);
                break;
            case '*':
                System.out.println(no1*no2);
                break;
            case '%':
                System.out.println(no1%no2);
                break;
            default:
                System.out.println("Invalid");

        }

    }
}

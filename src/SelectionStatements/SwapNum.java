package SelectionStatements;

public class SwapNum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Before swap"+ num1 + num2);
        num1 = num1 +num2;
        num2 = num1-num1;
        num1=num1 -num2;
        System.out.println("After swap " + num1+ num2);



    }
}

package Operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int no1 = 10;
        //condition check-T/F if T--->exp1 if f--->exp2
        int res = (no1==10)? no1+10 : no1-10;
        System.out.println(res);
    }
}

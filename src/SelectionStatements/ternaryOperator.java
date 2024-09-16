package SelectionStatements;

public class ternaryOperator {
    public static void main(String[] args) {
        int no1 = 45;
        int no2 = 56;
        int no3 = 60;

        int res= (no1 > no2 && no1>no3)? no1:(no2 >no1 && no2 >no3)?no2:no3;
        System.out.println(res + " greater number");

    }


}

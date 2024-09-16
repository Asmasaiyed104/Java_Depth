package Operator;

public class UnaryOperators {
    public static void main(String[] args) {
        int no1 = 10;
        no1=no1++;
        // first print 10 then increment  then in
        // second line it will print incremented num
        System.out.println(no1++);//10
        System.out.println(no1);//11
        System.out.println(++no1);//12
        System.out.println(no1--);//12
        System.out.println(--no1);//10
        System.out.println(no1++);//10
        System.out.println(no1);//11
    }
}

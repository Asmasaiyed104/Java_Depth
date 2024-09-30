package Java8Features.LambdaExpression;

interface I2{
    void m2();
}
public class Test2 {
    public static void main(String[] args) {
        I2 i  =()-> {System.out.println("I am in m2");};
        i.m2();
    }

}

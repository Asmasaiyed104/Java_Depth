package Java8Features.LambdaExpression;


//interface I1{
//
//    void m1();
//}
//class A implements I1{
//    @Override
//    public void m1() {
//        System.out.println("I am in m1 method");
//    }
//}
//public class Test1 {
//
//    public static void main(String[] args) {
//
//    }
//
//}
interface I1{
    void m1();
}
public class Test1 {
    public static void main(String[] args) {

        I1 ob = new I1() {

            public void m1() {
                System.out.println("I am in m1 method");
            }
        };
        ob.m1();
    }
}
package Java8Features.LambdaExpression;

interface  I3{
    void m3(int a,int b);
}
public class Test3 {
    public static void main(String[] args) {
        //I3 i =(int a)-> System.out.println(a);
        //I3 i =a-> System.out.println(a);
        I3 i = (a,b) -> System.out.println(a+b);
        // if suppose i want to add more statemments i can do in
        // curly braces
        i.m3(10,30);
    }
}

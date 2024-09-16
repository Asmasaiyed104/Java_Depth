package Polymorphism.MethodOverLoading;
class Test{

    void display()
    {
        System.out.println("1");
    }
    void display(int a)
    {
        System.out.println("2");
    }
    void display(int a, int b)
    {
        System.out.println("3");
    }
}
public class MethodOverloading1
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.display();
        t.display(10);
        t.display(10, 20);
    }
}
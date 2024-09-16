package Polymorphism.MethodOverLoading;

class Test3
{
    void display(String a)
    {
        System.out.println(a);
    }
    void display(int a)
    {
        System.out.println(a);
    }
}
class MethodOverloading2
{
    public static void main(String[] args)
    {
        Test3 t=new Test3();
        t.display(10);
        t.display("asma");
    }
}
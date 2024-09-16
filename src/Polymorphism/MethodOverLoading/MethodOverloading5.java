package Polymorphism.MethodOverLoading;

class Test6
{
    void display(int a)
    {
        System.out.println(a);
    }
}
class MethodOverloading5
{
    public static void main(String[] args)
    {
        Test6 t=new Test6();
        t.display('a');
        t.display(10);
    }
}
package Polymorphism.MethodOverLoading;

class Test5
{
    void display(int a)
    {
        System.out.println(a);
    }
    void display(char a)
    {
        System.out.println(a);
    }
}
class MethodOverloading4
{
    public static void main(String[] args)
    {
        Test5 t=new Test5();
        t.display(10);
        t.display('a');
    }
}
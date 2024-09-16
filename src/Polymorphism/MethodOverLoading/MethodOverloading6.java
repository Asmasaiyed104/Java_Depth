package Polymorphism.MethodOverLoading;

class Test7
{
    void display(int a)
    {
        System.out.println("1 : "+a);
    }
    void display(char c)
    {
        System.out.println("2 : "+c);
    }
}
class MethodOverloading6
{
    public static void main(String[] args)
    {
        Test7 t=new Test7();
        t.display('a');
        t.display(10);
    }
}
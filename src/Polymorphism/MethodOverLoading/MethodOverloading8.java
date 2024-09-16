package Polymorphism.MethodOverLoading;

class Test9
{
    void display(Object a)
    {
        System.out.println("1");
    }
    void display(String a)
    {
        System.out.println("2");
    }
}
class MethodOverloading8
{
    public static void main(String[] args)
    {
        Test9 t=new Test9();
        t.display(null);
    }
}
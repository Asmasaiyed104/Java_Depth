package Polymorphism.MethodOverLoading;

class Test10
{
    void display(Object a)
    {
        System.out.println("1");
    }
    void display(String a)
    {
        System.out.println("2");
    }
    void display(StringBuilder a)
    {
        System.out.println("3");
    }
}
class MethodOverloading9
{
    public static void main(String[] args)
    {
        Test10 t=new Test10();

        //t.display(null);

        t.display("asma");
        t.display(new StringBuilder("zoheb"));

        Object o=new Object();
        t.display(o);
    }
}
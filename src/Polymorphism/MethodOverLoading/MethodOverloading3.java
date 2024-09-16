package Polymorphism.MethodOverLoading;

class Test4
{
    void display(String a, int b)
    {
        System.out.println(a+", "+b);
    }
    void display(int a, String b)
    {
        System.out.println(a+", "+b);
    }
}
class MethodOverloading3
{
    public static void main(String[] args)
    {
        Test4 t=new Test4();
        t.display(10, "zoheb");
        t.display("asma", 10);
    }
}
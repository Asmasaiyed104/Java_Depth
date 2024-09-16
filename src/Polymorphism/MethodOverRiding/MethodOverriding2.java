package Polymorphism.MethodOverRiding;

class C
{
    void show()
    {
        System.out.println("1");
    }
    void show(int a)
    {
        System.out.println(a);
    }
}
class D extends A
{
    void show()
    {
        System.out.println("2");
    }
    void show(int a)
    {
        System.out.println(a);
    }
}
class MethodOverriding2
{
    public static void main(String[] args)
    {
        C ob1=new C();
        ob1.show();

        D ob2=new D();
        ob2.show();

       // C ob3 = new B();
        //ob3.show(20);

       // C ob3=new D();
        //ob3.show();
        //ob3.show();			not possible
    }
}
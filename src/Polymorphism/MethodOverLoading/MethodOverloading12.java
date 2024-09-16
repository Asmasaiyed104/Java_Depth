package Polymorphism.MethodOverLoading;

class Test13
{
    Test13()
    {
        System.out.println("1");
    }
    Test13(int a)
    {
        System.out.println("2");
    }
}
class MethodOverloading12
{
    public static void main(String[] args)
    {
        new Test();
        Test13 t2=new Test13(10);
    }
}

package Polymorphism.MethodOverLoading;

class Test8
{
    void display(int a)
    {
        System.out.println("First method : "+a);
    }
    void display(int... a)
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class MethodOverloading7
{
    public static void main(String[] args)
    {
        Test8 t=new Test8();
        t.display();
        t.display(10);
        t.display(20,30);
    }
}
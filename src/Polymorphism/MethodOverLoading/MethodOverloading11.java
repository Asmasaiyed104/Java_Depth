package Polymorphism.MethodOverLoading;

class MethodOverloading11
{
    public static void main(String[] args)
    {
        System.out.println("1");

        MethodOverloading11 ob=new MethodOverloading11();
        ob.main("asma");
    }
    public static void main(String args)
    {
        System.out.println("2");
    }
}
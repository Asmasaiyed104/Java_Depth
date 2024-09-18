package SuperFinal;
class C
{
    final void m2()
    {
        System.out.println("i am in class A");
    }
}
class B extends C
{
    //error - final method cannot be overridden
    //void m2()
    {
        System.out.println("i am in class B");
    }
}
class FinalTest2
{
    public static void main(String[] args)
    {
        C ob=new B();
        ob.m2();
    }
}
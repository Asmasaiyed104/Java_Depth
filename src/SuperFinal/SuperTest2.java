package SuperFinal;
class A3
{
    void show1()
    {
        System.out.println("i m in class A");
    }
}
class B3 extends A3
{
    void show2()
    {
        super.show1();
        System.out.println("im in class B");
    }
}

class SuperTest2
{
    public static void main(String[] args)
    {
        B3 ob=new B3();
        ob.show2();
    }
}
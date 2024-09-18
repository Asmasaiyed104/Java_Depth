package Super;

class A
{
    int no=10;
}
class B2 extends A
{
    int no=20;
    void show(int no)
    {
        //System.out.println(no);
        //System.out.println(this.no);
        System.out.println(super.no);
    }
}

class SuperTest
{
    public static void main(String[] args)
    {
        B2 ob=new B2();
        ob.show(30);
    }
}
package Collection.Proj3;


import java.util.ArrayList;

public class Test6
{
    public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);

        ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add("asma");

        al1.add(al2);

        System.out.println(al1.contains(al2));

        System.out.println(al1);
    }
}

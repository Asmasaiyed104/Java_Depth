package Collection.Proj3;

import java.util.ArrayList;

public class Test7
{
    public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("asma");

        System.out.println(al1);
        System.out.println(al1.isEmpty());

        al1.clear();

        System.out.println(al1.isEmpty());
    }
}

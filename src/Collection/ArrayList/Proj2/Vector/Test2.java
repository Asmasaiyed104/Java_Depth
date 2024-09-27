package Collection.ArrayList.Proj2.Vector;

import java.util.Vector;

public class Test2
{
    public static void main(String[] args)
    {
        Vector v=new Vector(7);
        System.out.println(v.capacity());

        for(int i=0; i<15; i++)
        {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());
    }
}

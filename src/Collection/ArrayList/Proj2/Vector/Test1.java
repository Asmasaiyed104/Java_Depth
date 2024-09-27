package Collection.ArrayList.Proj2.Vector;

import java.util.Vector;

public class Test1
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        System.out.println(v.capacity());

        for(int i=0; i<21; i++)
        {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());
    }
}

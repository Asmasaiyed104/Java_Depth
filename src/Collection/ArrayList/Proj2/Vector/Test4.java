package Collection.ArrayList.Proj2.Vector;

import java.util.Vector;

public class Test4
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        System.out.println(v.capacity());

        for(int i=0; i<10; i++)
        {
            v.addElement(i);
        }

        System.out.println(v.firstElement());   //0
        System.out.println(v.lastElement());    //9
        System.out.println(v.removeElement(5)); //true
        v.removeAllElements();
        System.out.println(v);                  //[]
    }
}

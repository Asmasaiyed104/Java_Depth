package Collection.HashMap.MapProject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author asma
 */
public class Test
{
    public static void main(String[] args)
    {
//        ArrayList al=new ArrayList();
//
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        al.add(50);
//
//        System.out.println(al);


        HashMap hm=new HashMap();

        hm.put(101, "asma");
        hm.put(102, "amit");
        hm.put(103, "rahul");
        hm.put(104, "deepesh");
        hm.put(105, "priya");

       // System.out.println(hm);

        //System.out.println(hm.get(103));

        //System.out.println(hm.remove(103));
        //System.out.println(hm);

       // hm.clear();
        //System.out.println(hm);

       // System.out.println(hm.size());

        //System.out.println(hm.containsKey(114));
        //System.out.println(hm.containsValue("deepak"));

        //System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
}

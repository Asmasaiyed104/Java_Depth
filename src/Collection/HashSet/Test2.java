package Collection.HashSet;


import Inheritance.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");

        HashSet hs = new HashSet();
        hs.add("aaa");
        hs.add(10);
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        System.out.println(hs);
    }
}

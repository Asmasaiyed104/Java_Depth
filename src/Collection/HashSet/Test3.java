package Collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        al.add("aaa");

//
//
//        HashSet hs = new HashSet(5,0.80f);

        HashSet hs = new HashSet();
        // not store duplicate value

        hs.add("bbb");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        System.out.println(hs);
    }
}
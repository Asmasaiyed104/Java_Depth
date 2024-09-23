package Collection.HashSet;

import Inheritance.A;

import java.util.ArrayList;
import java.util.HashSet;

public class Test4 {
    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");

       // hs.clear();
        hs.contains("bbb");
        hs.remove("aaa");
        System.out.println(hs);
    }
}
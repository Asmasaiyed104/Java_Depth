package Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("aaa");
        hs.add(10);
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        System.out.println(hs);
    }
}

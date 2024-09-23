package Collection.HashSet;

import java.util.LinkedHashSet;

public class Test5 {
    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();

        //follows insertion sequence
        lh.add("aaa");
        lh.add("bbb");
        lh.add("fff");
        lh.add("ggg");
        lh.add("ccc");
        lh.add("ddd");
        lh.add("eee");

        lh.removeFirst();

        System.out.println(lh);
    }
}

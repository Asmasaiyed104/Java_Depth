package Collection.ArrayList.Proj2;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);

        ArrayList al2 = new ArrayList();
        al1.add("asma");

        al1.addAll(2,al2);

        System.out.println(al1);
        System.out.println(al2);
    }
}

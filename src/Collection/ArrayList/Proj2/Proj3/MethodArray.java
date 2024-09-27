package Collection.ArrayList.Proj2.Proj3;

import java.util.ArrayList;

public class MethodArray {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        ArrayList al2 = new ArrayList();
        al2.add("asma");
        al2.add("amit");

        al.addAll(al2);
        System.out.println();

    }
}

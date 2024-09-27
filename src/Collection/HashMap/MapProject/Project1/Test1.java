package Collection.HashMap.MapProject.Project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
         hm.put(201,"A");
         hm.put(202,"B");
         hm.put(203,"A+");
         hm.put(204,"C");
         hm.put(205,"B+");

        System.out.println(hm);

        Set set = hm.entrySet();
        System.out.println(set);

        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "= " + entry.getValue());
            System.out.println("---------------------------------------");
        }
    }
}

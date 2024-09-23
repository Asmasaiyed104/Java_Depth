package Collection.Map.Project1;

import java.util.HashMap;
import java.util.Map;

public class CredentialMap {
    public static void main(String[] args) {
        Map<String, String>credMap = new HashMap<>();

        //add 3 credetial
        credMap.put("asmaPragra@gmail.com","pwd1");
        credMap.put("ashwiniPragra@gmail.com","pwd2");
        credMap.put("shrutiPragra@gmail.com","pwd3");

        //puIfAbsent method
        credMap.putIfAbsent("meetPragra@gmail.com","pwd4");
        credMap.putIfAbsent("vidhiPragra@gmail.com","pwd5");

        //fetch and print here
       String emailToFetch = "asmaPragra@gmail.com";
       String password = credMap.get(emailToFetch);
        System.out.println("********************************************");
        System.out.println("********Welcome to Pragra Credential********");
        System.out.println("********************************************");
        System.out.println("Fetch stuff : " + emailToFetch + "->" + password);
        System.out.println("--------------------------------------------");

        for (String email :credMap.keySet()){
            credMap.put(email,"Password123");
        }
        //print
        System.out.println("Updated Stuff : ");

        for(Map.Entry<String, String> entry : credMap.entrySet()){
            System.out.println(entry.getKey()+ " -> " +entry.getValue());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Clear Stuff :");

        credMap.clear();

        System.out.println("--------------------------------------------");
        System.out.println("Credetial Stuff after clear : " +credMap);
    }
}

package String.StringsProjects;

public class stringTest {
    public static void main(String[] args) {
        String s1 = "   TEST   ";
        String s2 = new String("test");

        System.out.println("Length of given string is "+s1.length());

        boolean test = s1.equals("test");
        System.out.println(s1 == s2);

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        char ch = s1.charAt(2);
        System.out.println(ch);


        char[] chars = s1.toCharArray();


        String name = "   pragra    ";
        System.out.println(name);
        String trim = name.trim();
        System.out.println(trim);




    }
}
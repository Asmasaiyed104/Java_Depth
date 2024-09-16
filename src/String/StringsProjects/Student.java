package String.StringsProjects;

public class Student {

    String name;
    String id;

    public static void main(String[] args) {

        Student s = new Student();

        StringBuffer sb = new StringBuffer("Toronto");

        StringBuffer address = sb.append("  Canada");

        System.out.println(sb);
        System.out.println(address);

        sb.insert(0,"O");
        System.out.println("After insert : " + sb);


//        sb.replace(sb.indexOf("canada"),sb.indexOf("Canada") + "Canada".length(),"USA");
//        System.out.println("After replace : " + sb);

        sb.reverse();
        System.out.println("After Reverse : " + sb);


        int capacity = sb.capacity();
        System.out.println("Capacity : " + capacity);


        char ch = sb.charAt(5);
        System.out.println("char : " + ch);

        int length = sb.length();
        System.out.println("Length : " + length);


        sb.replace(1,4, "Ca");
        System.out.println("After replace : " + sb);




    }

}

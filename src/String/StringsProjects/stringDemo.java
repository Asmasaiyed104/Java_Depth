package String.StringsProjects;

public class stringDemo {
    public static void main(String[] args) {

        String s1 = "Pragra ";
        String s2 = s1.concat("Incorporated");
        String s3 = "Pragra ";
        String s4 = "Pragra ";

        s3.concat("Inc");
        System.out.println(s3);




        System.out.println(s1); // Pragra Incorporated
        System.out.println(s2);
    }
}
package String.StringsProjects;

public class stringPractice {

    public static void main(String[] args) {

        String s = "Hello, world!";

        // reverse string
        String sCompanyName = "Pragra";
        // you can stored reverse string
        String reversed ="";

        // loop start with last char, move backward side from
        // end to begining, add each character to the reverse string
        for(int i =sCompanyName.length()-1; i >=0; i--){
            reversed += sCompanyName.charAt(i);
        }
        System.out.println("Reverse string : " + reversed);


        // string practice
        int length =s.length();
        char ch = s.charAt(2);
        // it will start to count index 7 to the end of string
        String sub = s.substring(7);
        String sub1 = s.substring(4);
        String sub2 = s.substring(3,5);
        System.out.println("Length : " + length);
        System.out.println("Character at index 1 is : " + ch);
        System.out.println("Substring : " + sub);
        System.out.println("Substring : " + sub1);
        System.out.println("Substring : " + sub2);




    }
}

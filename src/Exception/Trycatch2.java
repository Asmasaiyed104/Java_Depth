package Exception;

public class Trycatch2 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(100/0);
        }catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}

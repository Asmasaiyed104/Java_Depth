package Exception;

public class TryCatch1 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
        }
        catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}

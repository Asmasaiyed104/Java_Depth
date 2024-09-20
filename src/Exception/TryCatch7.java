package Exception;

public class TryCatch7 {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println(100/0);
            System.out.println("2");

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("3....");

        }catch (Exception e) {
            System.out.println("3");

        }
        System.out.println("4");
    }
    /*
    //this will not compile because if Exception is parent
    * public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println(100/0);
            System.out.println("2");

        }catch (Exception e) {
            System.out.println("3");

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("3....");

        }
        System.out.println("4");
    }*/

}
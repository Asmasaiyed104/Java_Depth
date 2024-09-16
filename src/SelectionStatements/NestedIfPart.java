package SelectionStatements;

public class NestedIfPart {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        int no3 = 20;
        if(no1 == no2){
            if(no1 ==no3){
                System.out.println("successfully");
            }else {
                System.out.println("not");
            }
        } if (no2==no3) {
            if(no1 != no2){
                System.out.println("other one compile successfully");
            }else{
                System.out.println("not compiled");
            }

        }else {
            System.out.println("OMG");
        }
    }
}

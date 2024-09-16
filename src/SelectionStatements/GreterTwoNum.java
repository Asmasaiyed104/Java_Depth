package SelectionStatements;

public class GreterTwoNum {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
//        if(no1 >no2){
//            System.out.println("No1 is greater than no1");
//        }else {
//            System.out.println("No2 is greater than no 1");
//        }
        int res = (no1 > no2)? no1 : no2;
        System.out.println(res +" is grater Number ");
    }
}

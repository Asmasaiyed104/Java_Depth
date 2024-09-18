package ThisKeyWord;

import Collection.ArrayList.Proj2.Test2;

public class Test {
    int no =10;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
        test.M3();
      // this keyword helps to print current class number
       test.M2(20);
        System.out.println(test.no);
    }

    public void M3(){
        System.out.println("Object value is " + this);
    }
    public  void  M2 (int no){
        System.out.println(no);
    }
}

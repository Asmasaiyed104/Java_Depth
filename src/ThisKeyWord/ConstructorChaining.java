package ThisKeyWord;

class Test1{
    Test1(){
        this(10);
        System.out.println("default Constructor");
    }
    Test1 (int a){
        this("asma");
        System.out.println(a);
    }
    Test1(String a){
        System.out.println(a);
    }

}


public class ConstructorChaining {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

    }
}

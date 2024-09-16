package Polymorphism.OverloadingProjects;

public class OverLoading {
    public static void main(String[] args) {

        OverLoading ol =new OverLoading();

        // java will use number of arguments as it guide to determine  which version of
        // overloaded method to actually call
        // overloaded method is differ in types and number of their parameters
        ol.test(12);
        ol.test(23.67);
        ol.test(23, 48);
        ol.test();


    }

    // when java encounters a call to overloaded method, it simple e executes
    // the version of the method whose parameters match the arguments used in the call

    public void test(){
        System.out.println("No Parameters");
    }
    public void test(int a){
        System.out.println("one Parameter : " + a);

    }
    public void test(int a, int b){
        System.out.println("Two parameters a & b " + a + "" + b);
    }

    public double test(double a){

        System.out.println("Double one parameters  only a : " + a );
        return a * a;
    }


}

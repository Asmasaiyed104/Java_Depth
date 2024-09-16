package Polymorphism.OverloadingProjects;

public class Test {

    int a, b;

    public Test(int i , int j){
        a = i;
        b = j;
    }

    boolean equalTo(Test o){
        if(o.a == a && o.b ==b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Test ob1 = new Test(100, 200);
        Test ob2 = new Test(100, 200);
        Test ob3 = new Test(-1, -1);

        System.out.println("object 1 and object 2 equal :" + ob1.equalTo(ob2));
        System.out.println("object 1 and object 3 equal :" + ob1.equalTo(ob3));
    }

}

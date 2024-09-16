package TypeCasting;

public class ImplicitTc {

    public static void main(String[] args) {
        byte a = 2;
        int b = a;
        byte no1=10;
        long no2=100;
        //jvm will do byte long res = (long)no1 + no2;
        long res=no1+no2;
        int result = a + b;
        System.out.println("Implicite casting " + result);
        System.out.println(res);

    }
}

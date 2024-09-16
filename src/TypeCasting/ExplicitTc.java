package TypeCasting;

public class ExplicitTc {
    public static void main(String[] args) {
        //int no1=10;
        //byte no2=(byte)no1;
        //-------------------------------
        int no1=10;

        long num = 243456567;
        short num1 = (short) num ;
        byte num2 =(byte) num;
        short num3=(byte)(short)num;
        //short no2=(short)no1;
        //short no2=(byte)no1;
        short no2=(byte)(short)no1;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
    }


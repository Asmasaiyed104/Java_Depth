package Java8Features.LambdaExpression;
import java.util.function.Function;
public class Test4 {
    public static void main(String[] args) {
        Function<Integer,Integer> f =(sal)->sal *12;
        System.out.println(f.apply(10000)+" k");

        Function<String,String>f1 = str ->str.concat(" is a java developer");
        System.out.println(f1.apply("asma"));
    }

}

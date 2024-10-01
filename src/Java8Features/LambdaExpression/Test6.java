package Java8Features.LambdaExpression;

import java.util.function.Supplier;

public class Test6 {
    public static void main(String[] args) {
        Supplier<String> s = () ->
        {
            String[] names={"asma", "amit", "rahul", "deepesh", "kamal"};
            int i=(int)(Math.random()*4);
            return names[i];
        };
        System.out.println(s.get());
    }
}

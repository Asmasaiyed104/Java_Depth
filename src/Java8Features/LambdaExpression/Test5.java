package Java8Features.LambdaExpression;

import java.util.function.Consumer;

public class Test5 {
    public static void main(String[] args) {
        Consumer<String> c = str -> System.out.println(str.concat(" asma"));
       c.accept(" saiyed");
    }
}

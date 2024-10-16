package Java8Features.StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer>a1 = new ArrayList<>();
        a1.add(11);
        a1.add(22);
        a1.add(33);
        a1.add(44);
        a1.add(55);
        a1.add(66);
        a1.add(77);
        a1.add(88);
        a1.add(99);

        a1.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println("Even num : " +e));
        System.out.println("--------------------------------------");
        a1.stream().filter(n->n >=55).forEach(e-> System.out.println("Greater> = 55 :  " + e));
        System.out.println("---------------------------------------");
        a1.stream().filter(n -> n % 2 != 0).forEach(e -> System.out.println("ODD num : " +e));



//       Stream s2 = Stream.of(a1);
//       s2.forEach(e->System.out.println(e));

//        Stream s3 = Stream.of(100,200,300,400,500);
//        s3.forEach(e->System.out.println(e));


        //suppose we have array. how to get elements
//        int[]arr ={600,700,800,900,1000};
//       IntStream s4 = Arrays.stream(arr);
//       s4.forEach(e->System.out.println(e));


     //   Stream s5= Stream.empty();

       // Stream s6 = Stream.builder().build();
    }
}

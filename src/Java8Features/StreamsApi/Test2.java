package Java8Features.StreamsApi;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import  java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);


//        for (int i :a1){
//            if (i % 2 == 0) {
//
//                System.out.println(i);
//            }
//        }
        //------------------using stream api (first part)-------------------------------
//        Stream<Integer> s=a1.stream();
//        List l=s.filter(e->e%2==0).collect(Collectors.toList());
//        System.out.println(l);


        //------------------using stream api (second part)-------------------------------
        Stream<Integer> s=a1.stream();
        s.map(e->e*e).forEach(e->System.out.println(e));
//        s.filter(e->e%2==0).forEach(e->System.out.println(e));


        //------------------using stream api (second part)-------------------------------
        //al.stream().filter(e->e%2==0).forEach(e->System.out.println(e));


        //--------------count even numbers----------------------------
      //  System.out.println(a1.stream().filter(e->e%2==0).count());

//        a1.stream().filter(e->e > 30).forEach(e->System.out.println(e));




        //method chaining
//        String name="deepak";
//        String s1=name.concat("java");
//        String s2=s1.toUpperCase();
//        int l=s2.length();
//
//        int leng=name.concat("java").toUpperCase().length();
//        System.out.println(leng);


    ArrayList<String>al =new ArrayList<>();
        al.add("Asma");
        al.add("rahul");
        al.add("amit");
        al.add("deepesh");
        al.add("ankit");

        Stream<String> s2=al.stream();
       // al.stream().filter(e->e.length()>5).forEach(e->System.out.println(e));
        //s2.map(e->e.toUpperCase()).forEach(e->System.out.println(e));
       // s2.map(e->e.startsWith("a")).forEach(e->System.out.println(e));
       // s2.sorted().forEach(e->System.out.println(e));
        s.sorted((x,y)->-x.compareTo(y)).forEach(e->System.out.println(e));


    }
}


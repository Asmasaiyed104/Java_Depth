package JavaInterviewCodingPractice;

import String.StringsProjects.Student;

import java.util.Arrays;

import static java.lang.Math.round;
import static java.util.Arrays.stream;

public class StudentArrayEx {

    public static void main(String[] args) {
        int [ ] scores = {23,45,67,45,34,33,45,2};

        int sum = Arrays.stream(scores).sum();
        int avg = (int) round(Arrays.stream(scores)
                        .average()
                .orElse(0.0));
        int max = Arrays.stream(scores).max().orElse(0);
        int min =Arrays.stream(scores).min().orElse(0);

        System.out.println(avg);
        System.out.println("SUM : " + sum);
        System.out.println(max);
        System.out.println("Min :" + min);
      //  scores.toString();

//        System.out.println(Arrays.toString(scores));
//        System.out.println(Arrays.asList(scores));


        //print all numb in arrays

//        for(int i =0; i < scores.length; i++){
//
//            System.out.println("print all the elements " + scores[i]);
//        }
//        for(int temp : scores){
//            System.out.println(temp);
//        }
        //find the sum or average of all element

//        for(int temp: scores){
//            int sum = temp+
//            System.out.println(sum);
//        }


        //
    }
}

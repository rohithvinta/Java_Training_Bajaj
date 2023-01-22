package com.dayfour;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamImplementation {

   public static void main(String args[])
   {
    List<Integer> number=Arrays.asList(1,2,3,4,5);
    List<Integer> sq =number.stream().map(x->x*x).collect(Collectors.toList());
    System.out.println(sq);

    List <Integer> result=number.stream().sorted().collect(Collectors.toList());
    System.out.println(result);
    number.stream().filter(x -> x<4).forEach(x->System.out.println(x));
   }
}
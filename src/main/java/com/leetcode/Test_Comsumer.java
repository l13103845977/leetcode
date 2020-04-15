package com.leetcode;


import java.util.function.Consumer;
import java.util.function.Function;


// functional/Strategize.java
public class Test_Comsumer {
private  String s="5";

    public  void generateX(Consumer<String> consumer) {
        consumer.accept("hello consumer");
    }
    public static void main(String[] args) {



        Function<Integer, Integer> incr1 = x -> x + 1;
        Function<Integer, Integer> multiply = x -> x * 2;
        int x = 2;
        System.out.println("f(x)=x+1,when x=" + x + ", f(x)=" + incr1.apply(x));
        System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", f(g(x))=" + incr1.compose(multiply).apply(x));
        System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", g(f(x))=" + incr1.andThen(multiply).apply(x));

        Integer a=3;
        System.out.println(a.toString());
        People people = new People.Builder().setAge(1).setHeight(2).setName("张三").build();
        System.out.println(people.toString());
    }




}
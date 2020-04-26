package com.leetcode;


import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;


// functional/Strategize.java
public class Test_Comsumer {
private  String s="5";

    public  void generateX(Consumer<String> consumer) {
        consumer.accept("hello consumer");
    }
    public static void main(String[] args) {


       //
       // Function<Integer, Integer> incr1 = x -> x + 1;
       // Function<Integer, Integer> multiply = x -> x * 2;
       // int x = 2;
       // System.out.println("f(x)=x+1,when x=" + x + ", f(x)=" + incr1.apply(x));
       // System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", f(g(x))=" + incr1.compose(multiply).apply(x));
       // System.out.println("f(x)=x+1,g(x)=2x, when x=" + x + ", g(f(x))=" + incr1.andThen(multiply).apply(x));
       //
       // Integer a=3;
       // System.out.println(a.toString());
       // People people = new People.Builder().setAge(1).setHeight(2).setName("张三").build();
       // System.out.println(people.toString());
       //
       // List list=new ArrayList();
       // list.add(1);
       // list.add(2);
       // list.add(3);
       // list.add(4);
       // list.add(5);
       //List newlist= (List) list.stream().filter(s->Integer.valueOf(s.toString())>2).collect(Collectors.toList());
       // System.out.println(newlist.size());
String s="";
getImgStr("");
    }



    public static void  getImgStr(String imgFile) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream("C:\\Users\\lsy\\Desktop\\ee3abcdf3a9ac2bd1d5219dd88561bc.jpg");
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));

    }


}
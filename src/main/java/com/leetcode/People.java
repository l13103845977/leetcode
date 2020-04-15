package com.leetcode;

/**
 * 建造者模式设计实体类
 * 建造者模式的关键是，1.构建器是实体类的内部静态类
 *
 *                 2.实体类有一个构造器，其参数是构建器（Builder）
 *
 *                 3.通过这个构建器可以将实例的属性赋值。
 *
 *                 4.构建器的build()方法，返回的是通过构造器创造的实例
 */
public class People {
    private final int age;
    private final String name;
    private final double weight;
    private final double height;

    private People(Builder builder) {
        this.age=builder.age;
        this.name=builder.name;
        this.weight=builder.weight;
        this.height=builder.height;
    }

     static class Builder {
        private  int age=0;
        private String name="";
        private double weight;
        private double height;
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
                public Builder setName(String name) {
            this.name = name;
                    return this;
        }
             public Builder setWeight(double weight) {
            this.weight = weight;
                 return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }
        public People build(){
            return new People(this);
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

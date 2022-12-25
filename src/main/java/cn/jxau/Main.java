package cn.jxau;

import java.util.Optional;

/**
 * jdk8 optional test example
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        test(null);
    }

    static void test(String s){
        Optional.ofNullable(s).ifPresent(System.out::println);
    }

}
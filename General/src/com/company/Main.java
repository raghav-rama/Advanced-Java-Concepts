package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Main {
    class Square {
        static int square(int x) {
            return x*x;
        }
    }
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.stream().map(Square::square).forEach(System.out::println);
//        System.out.println(list);
        int a=8;

        Scanner scanner = new Scanner(System.in);
//        List<List<Integer>> list = new ArrayList<>(5);
//        list.forEach(Integer::parseInt);
//        IntStream.range(0,5).forEach(i -> {
//            try {
//                list.add(
//                        Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
        int skyIsTheLimit=5;



//      //Remove crap from your life
        List<String> life = IntStream.range(0, skyIsTheLimit).mapToObj(i -> scanner.nextLine()).toList();
        life.stream().filter(s -> !s.contains("crap")).toList().forEach(System.out::println);





//        System.out.println(goals);
//        System.out.println(-10%5);
    }
}
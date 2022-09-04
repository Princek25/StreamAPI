package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        //Q1. create a list and filter all even no. from list without stream?
        // it takes 9 lines

        List<Integer> list1 = List.of(2,4,50,21,56,62,67);

        List<Integer> listEven = new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println("List1" + list1);
        System.out.println("Filter Even" + listEven);

        //Q2. Create a list and filter all even no. from list with stream API?
        // it takes only 3 lines
        // 1st way to write stream api

        Stream<Integer> stream = list1.stream();
        List<Integer> newList1 = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList1);

        // 2nd way to write stream api in 2 lines
        List<Integer> newList2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList2);

        // Q3. Filter no. which is more than 50 (Stream API)

        List<Integer> newList3 = list1.stream().filter(i-> i>50).collect(Collectors.toList());
        System.out.println(newList3);
    }
}

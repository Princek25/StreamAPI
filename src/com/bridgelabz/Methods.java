package com.bridgelabz;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // filter(predicate)- boolean value function
        // e->{return true}

        //map - each element operation
        // map(Function) - return value

        List<String> names = List.of("Aman", "Abhinav", "Ankit", "Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23,4,7,5,6);
        List<Integer> square = numbers.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(square);
    }
}

package com.example.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class floatDouble {
    public static void main(String[] args) {
        float a = 0.8f;
        System.out.println((double) a);
        Person person1 = new Person("Alice", 30);

        List<Person> array = List.of(person1);
        ToIntFunction<Person> mapperFunction = new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person person) {
                return person.getAge();
            }
        };
        array.stream().mapToInt(mapperFunction).findAny().ifPresent(System.out::println);

    }
}

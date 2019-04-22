package chapter30;

import java.lang.System;
import java.lang.String;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import chapter30.MyStudent;

public class MyStudentDemo {

    public static void main(String[] args) {

        MyStudent[] students = {new MyStudent("John", "Lu", "CS", 32, 78), new MyStudent("Susan", "Yao", "Math", 31, 85.4), new MyStudent("Kim", "Johnson", "CS", 30, 78.1)};

        System.out.printf("%10s%10s\n", "Department", "Average");
        Stream.of(students).collect(Collectors.
                groupingBy(MyStudent::getMajor, TreeMap::new, Collectors.averagingDouble(MyStudent::getScore))).
                forEach((k, v) -> System.out.printf("%10s%10.2f\n", k, v));

    }  // main()

}  // class MyStudentDemo
package chapter30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;

public class CollectDemo {

    public static void main(String[] args) {

        String[] names = {"John", "Peter", "Susan", "john"};

        System.out.println("The number of characters for all names: " +
                Stream.of(names).
                        collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).
                        length()
        );

        List<String> list;

        list = Stream.of(names).
                collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("list: " + list);

        list = Stream.of(names).
                collect(Collectors.toList());

        System.out.println("list: " + list);

        Set<String> set;

        set = Stream.of(names).map(e -> e.toUpperCase()).
                collect(Collectors.toSet());

        System.out.println("set: " + set);

        Map<String, Integer> map;

        map = Stream.of(names).
                collect(Collectors.toMap(e -> e, e -> e.length()));

        System.out.println("map: " + map);

        System.out.println("The total number of characters is " +
                Stream.of(names).
                        collect(
                                Collectors.summingInt(e -> e.length())
                        )
        );

        IntSummaryStatistics stats;

        stats = Stream.of(names).
                collect(
                        Collectors.summarizingInt(e -> e.length())
                );

        System.out.println("Max: "     + stats.getMax    ());
        System.out.println("Min: "     + stats.getMin    ());
        System.out.println("Average: " + stats.getAverage());

    }  // main()

}  // class CollectDemo
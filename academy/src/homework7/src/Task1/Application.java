package Task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public Map<String, Long> mapList(Integer num, Integer key) {
        Stream<Double> list = Stream.generate(() -> new Random().nextInt(key))
                .limit(num).map(m -> m * Math.PI - 20)
                .filter(n -> n < 100).sorted().distinct().skip(3);

        list.collect(Collectors.toMap(n -> "Number " + n, Double::longValue)).
                forEach((n, k) -> System.out.println(n + " -> " + k));
        return new TreeMap<>();
    }

    public static void main(String[] args) {
        Application task = new Application();
        task.mapList(100, 100);
    }
}

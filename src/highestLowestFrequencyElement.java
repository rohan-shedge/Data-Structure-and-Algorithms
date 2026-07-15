import java.util.*;


//https://takeuforward.org/arrays/find-the-highest-lowest-frequency-element
public class highestLowestFrequencyElement {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] array = {10,5,10,15,10,5};
        for (var e : array) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        map.forEach((x, y) -> { System.out.println("key -> " + x + " value -> " + y); } );


        System.out.println("---------");

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        Optional<Map.Entry<Integer, Integer>> entry = set.stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        entry.ifPresent(x -> {
            System.out.println(x.getKey());
        });

        System.out.println("---------");

        set = map.entrySet();
        entry = set.stream()
                .min((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        entry.ifPresent(x -> {
            System.out.println(x.getKey());
        });


    }
}

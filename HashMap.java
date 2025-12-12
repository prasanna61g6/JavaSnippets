import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class DifferentMaps {
    public static void main(String[] args) {
        // HashMaps doesn't keep any order
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Bob",20);
        map1.put("Alice", 19);
        map1.put("Charlie", 21);
        map1.put("Ron", 18);
        System.out.println(map1);

        // LinkedHashMap keeps the insertion order intact
        // It implements both doubly linkedlist + hashmap
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Bob",20);
        map2.put("Alice", 19);
        map2.put("Charlie", 21);
        map2.put("Ron", 18);
        System.out.println(map2);

        /* Directly mapping the elements based on ascending order of keys
         * 'B': 2, 'A': 1, 'Z': 26
         * 'A': 1, 'B': 2, 'Z': 26
         * sort the elements in ascending order
         * Internally uses a self-balancing BST called as Red-Black Tree
         */
        TreeMap<String,Integer>map3 = new TreeMap<>();
        map3.put("Bob",20);
        map3.put("Alice", 19);
        map3.put("Charlie", 21);
        map3.put("Ron", 18);
        System.out.println(map3);

        int[] randomNumbers = {16, 4, 9, -12, 17, 7, 3, 21};
        // number-square of number in map (int,int)
        HashMap<Integer, Integer>m1 = new HashMap<>();
        LinkedHashMap<Integer, Integer>m2 = new LinkedHashMap<>();
        TreeMap<Integer, Integer>m3 = new TreeMap<>();
        for(int num: randomNumbers) {
            m1.put(num, num*num); // stroing in HashMap
            m2.put(num, num*num); // Storing in LinkedHashMap
            m3.put(num, num*num); // storing in TreeMap
        }
        System.out.println("HashMap: " + m1);
        System.out.println("LinkedHashMap: " + m2);
        System.out.println("TreeMap: " + m3);
    }
}

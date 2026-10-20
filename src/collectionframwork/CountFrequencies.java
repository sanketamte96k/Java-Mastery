package collectionframwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencies {
    public static void main(String[] args) {
        ArrayList<Integer> nums =
                new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 10, 40));
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            int count = e.getValue();
            System.out.println(e.getKey() + " occurs " + count + (count == 1 ? " time" : " times"));
        }
    }
}

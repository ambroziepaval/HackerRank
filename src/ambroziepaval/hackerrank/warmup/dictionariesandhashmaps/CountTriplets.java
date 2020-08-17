package ambroziepaval.hackerrank.warmup.dictionariesandhashmaps;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountTriplets {


    static long countTriplets(List<Long> arr, long r) {

        Map<Long, Long> multipleMap = new TreeMap<>();
        for (Long number : arr) {
            multipleMap.merge(number, 1L, Long::sum);
        }

        long tripletsCount = 0;
        for (Long key : multipleMap.keySet()) {
            Long first = multipleMap.get(key);
            Long second = multipleMap.get(key * r);
            Long third = multipleMap.get(key * r * r);

            if (r == 1L) {
                if (first >= 3) {
                    tripletsCount += (first * (first - 1) * (first - 2)) / 6;
                }

            } else if (second != null && third != null) {
                tripletsCount += first * second * third;
            }
        }

        return tripletsCount;
    }

    public static void main(String[] args) {

        List<Long> arr = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);
        long r = 3;

//        List<Long> arr = Arrays.asList(1L, 1L, 1L, 1L, 1L);
//        long r = 1;

//        System.out.println(CountTriplets.countTriplets_v1(arr, r));
        System.out.println(CountTriplets.countTriplets(arr, r));
    }
}

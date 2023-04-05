import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Task1(nums);
        System.out.println();
        Task2(nums);
        System.out.println();
        Task3(List.of("test", "TEST", "Test", "TesT", "test", "test" ));
        System.out.println();
        Task4(List.of("test", "TEST", "Test", "TesT", "test", "test" ));

    }

    private static void Task1(List<Integer> nums){
        System.out.println("Задача 1");
        for(Integer number: nums) {
            if (number%2==1) {
                System.out.print(number + " ");
            }
        }
    }

    private static void Task2(List<Integer> nums) {
        System.out.println("Задача 2");
        Set<Integer> set = new TreeSet<>(nums);
        for(Integer number: set) {
            if (number%2==0) {
                System.out.print(number + " ");
            }
        }
    }

    private static void Task3(List<String> words) {
        System.out.println("Задача 3");
        for(String word: words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");
            }
        }
    }

    private static void Task4(List<String> words) {
        System.out.println("Задача 4");
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.replace(word, map.get(word) + 1);
            }
        }
        int duplicatesWords = 0;
        for (Integer count : map.values()) {
            if (count > 1) {
                duplicatesWords++;
            }
        }
        System.out.print("Количество повторяющихся слов = " + duplicatesWords);
    }
}
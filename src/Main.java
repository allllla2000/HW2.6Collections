import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("cat", "dog", "dog", "dog", "dog", "beaver", "cta", "gdo"));


    public static void main(String[] args) {
        //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        // Код должен работать с любой последовательностью и объемом списка чисел.

        task4();
    }

    public static void unevenMethod() {
        for (int num : nums) {
            if (num % 2 != 0)
                System.out.println(num);
        }
    }

    public static void task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum)
                System.out.println(num);
            prevNum = num;

        }
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());


    }

}
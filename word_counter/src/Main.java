import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int n = scanner.nextInt();

//        Пример: hello world qwerty world; n = 2;
//        Результат: world

        String[] words = str.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String w: words) {
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
        }

        if (wordMap.containsValue(n)) {
            for (Map.Entry<String, Integer> w: wordMap.entrySet()) {
                if (w.getValue() == n) {
                    System.out.println(w.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Такого слова нет");
        }

    }
}

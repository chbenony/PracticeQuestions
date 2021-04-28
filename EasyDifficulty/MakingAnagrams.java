package EasyDifficulty;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        Map<Character, Integer> count = new HashMap<>();

        for (char ch : a.toCharArray()){
            int num = count.getOrDefault(ch, 0);
            count.put(ch, (num + 1));
        }

        for (char ch : b.toCharArray()){
            int num = count.getOrDefault(ch, 0);
            count.put(ch, (num - 1));
        }

        List<Integer> values = new ArrayList<>(count.values());

        int total = 0;
        for (Integer v : values){
            total += Math.abs(v);
        }
        return total;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

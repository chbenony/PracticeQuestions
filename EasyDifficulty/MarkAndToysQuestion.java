package EasyDifficulty;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Question:
 *
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money. Given a list of toy prices and an amount to spend, determine the maximum number of gifts he can buy.
 *
 * Note Each toy can be purchased only once.
 *
 * Example
 *
 * The budget is units of currency. He can buy items that cost for , or for units. The maximum is
 *
 * items.
 *
 * Function Description
 *
 * Complete the function maximumToys in the editor below.
 *
 * maximumToys has the following parameter(s):
 *
 *     int prices[n]: the toy prices
 *     int k: Mark's budget
 *
 * Returns
 *
 *     int: the maximum number of toys
 *
 * Input Format
 *
 * The first line contains two integers,
 * and , the number of priced toys and the amount Mark has to spend.
 * The next line contains space-separated integers
 *
 * Constraints
 *
 * A toy can't be bought multiple times.
 *
 */

public class MarkAndToysQuestion {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0, sum = 0;
        Arrays.sort(prices);

        for (int i = 0; i < prices.length; i++) {
            if (sum + prices[i] <= k) {
                sum += prices[i];
                count++;
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


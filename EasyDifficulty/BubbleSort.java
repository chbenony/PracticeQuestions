package EasyDifficulty;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    /*static void swap(int element1, int element2){
        int temp = a;
        a = b;
        b = temp;
    }
    static void debug(int[] something){
        for (int i = 0; i < something.length; i++){
            System.out.print(something[i] + " ");
        }
        System.out.print("\n");
    }*/
    static void countSwaps(int[] a) {
        int i = 0;
        int start = 0, end = a.length - 1;
        int count = 0;
        //int [] sortedA = new int[a.length];
        while (end > 0){
            start = 0;
            for (i = 0; i < end; i++){
                if (a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                    start = i;
                    count++;
                }
            }
            end = start;
        }

        //debug(a);
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}

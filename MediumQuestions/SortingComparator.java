package MediumQuestions;

/**
 *
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. The Player class is provided in the editor below. It has two fields:
 *
 * : a string.
 *
 *     : an integer.
 *
 * Given an array of
 * Player objects, write a comparator that sorts them in order of decreasing score. If or more players have the same score, sort those players alphabetically ascending by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method. In short, when sorting in ascending order, a comparator function returns if , if , and if
 *
 * .
 *
 * Declare a Checker class that implements the comparator method as described. It should sort first descending by score, then ascending by name. The code stub reads the input, creates a list of Player objects, uses your method to sort the data, and prints it out properly.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    int score;
    String name;

    public Player(String name, int score){
        this.score = score;
        this.name = name;
    }

    public String getNameAndScore(int score, String name){
        return this.score + " " + this.name;
    }
}
public class SortingComparator implements Comparator<Player> {

    public int compare(Player a, Player b){
        if (a.score > b.score)
            return -1;
        if (a.score == b.score)
            return a.name.compareTo(b.name);
        if (a.score < b.score)
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        SortingComparator checker = new SortingComparator();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}

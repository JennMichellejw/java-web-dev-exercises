package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        myString = myString.replaceAll(", $", "");
        myString = myString.replaceAll(". $", "");

        numbers.addAll(Arrays.asList(15, 26, 8, 5, 32, 13, 66, 12, 10, 17));
        words.addAll(Arrays.asList(myString.split(" ")));

        System.out.println(findSum(numbers));
        fiveLetterWords(words);
    }

    static int findSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    static void fiveLetterWords(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
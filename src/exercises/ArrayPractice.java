package exercises;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {

        int[] practiceArray = {1, 1, 2, 3, 5, 8};
        for (int num : practiceArray) {
            if (num % 2 == 1) {
                System.out.println(num);
            }

        }

        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] myArray = myString.split("\\.");
            for(String sentence : myArray){
                System.out.println(sentence);

            }
        }
    }

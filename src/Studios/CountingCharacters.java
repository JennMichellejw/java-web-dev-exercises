package Studios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
//import java.util.Arrays;

public class CountingCharacters {

    public static void main(String[] args) throws FileNotFoundException {

        //String initialString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner (System.in);
        System.out.println("enter a string:");
        //File fileText = new File("characterCountingFile");
        //Scanner text = new Scanner(fileText);
        String initialString = input.nextLine().toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        //initialString + text.nextLine();
        char[] characterArray = initialString.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        


        for (Character c : characterArray) {
            int count = 0;
            if(!characterCount.containsKey(c)){
                for (Character ch : characterArray) {
                    if (c.equals(ch)) {
                        count += 1;

                    }
                    characterCount.put(c, count);
                }

            }



        }

        System.out.println(characterCount);
    }

}
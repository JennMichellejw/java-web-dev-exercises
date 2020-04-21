package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
       String alice = "Alice was beginning to get very tired of sitting\n" +
               "by her sister on the bank, and of having nothing \n" +
               "to do: once or twice she had peeped into the \n" +
               "book her sister was reading, but it had no \n" +
               "pictures or conversations in it, 'and what is \n" +
               "the use of a book,' thought Alice 'without \n" +
               "pictures or conversation?'\n";
       System.out.println(alice);
       Scanner input = new Scanner(System.in);
       System.out.println("Search term:");
       String newInput = input.nextLine();
       int index = alice.indexOf(newInput);
       int inputLength = newInput.length();
       String newAlice = alice.substring(0, index - 1) + alice.substring(index + inputLength);

       System.out.println(alice.contains(newInput.toLowerCase()));

       System.out.println(index);
       System.out.println(newAlice);
       input.close();
    }
}

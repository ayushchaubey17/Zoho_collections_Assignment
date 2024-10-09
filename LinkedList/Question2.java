import java.util.LinkedList;
import java.util.ListIterator;


public class Question2 {
    public static void main(String[] args) {
         LinkedList<String> words = new LinkedList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        
         ListIterator<String> iterator = words.listIterator();
        
        // Iterate through the list and replace "three" with "THREE"
        while (iterator.hasNext()) {
            String currentWord = iterator.next();
            if (currentWord.equals("three")) {
                iterator.set("THREE");
            }
        }
        
        // Print the modified list
        System.out.println("Modified list: " + words);
    }
}


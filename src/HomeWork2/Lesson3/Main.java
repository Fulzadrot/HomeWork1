package HomeWork2.Lesson3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] colors = {"white", "blue", "black", "red", "orange", " pink","green","purple","yellow","blue"};
        Map <String,Integer> words = new HashMap<>();
        for (String x : colors) {
            words.put(x, words.getOrDefault(x,0)+ 1);
        }
        System.out.println(words);
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addContact("Vanya", "965549861565");
        telephoneDirectory.addContact("Roma", "9655498432565");
        telephoneDirectory.addContact("Katya", "965512861565");
        telephoneDirectory.addContact("Alex", "96554781565");
        telephoneDirectory.addContact("Denis", "965123861565");
        telephoneDirectory.addContact("Sasha", "965453861565");
        telephoneDirectory.addContact("Ira", "96554451565");
        telephoneDirectory.findAndPrint("Vanya");
        telephoneDirectory.findAndPrint("Katya");
        telephoneDirectory.findAndPrint("Denis");
    }
}

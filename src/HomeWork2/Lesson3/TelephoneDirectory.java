package HomeWork2.Lesson3;
import java.util.*;

public class TelephoneDirectory {
    HashMap<String, HashSet<String>> phoneBook;
    public TelephoneDirectory(){
        this.phoneBook = new HashMap<>();
    }
    public void addContact(String name, String phone){
        HashSet<String> book = phoneBook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phoneBook.put(name,book);
    }
    public void findAndPrint(String name){
        System.out.println("Контакт " + name + " Номер телефона:" + phoneBook.getOrDefault(name, new HashSet<>()));
    }
}

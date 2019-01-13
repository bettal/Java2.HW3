/**
 * Java.2.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson3.Ex2;

import java.util.HashMap;
import java.util.HashSet;


public class PhoneBook {
    private HashMap<String, HashSet<Integer>> pb;
    PhoneBook(){this.pb = new HashMap<>();}
   // public PhoneBook(String contact ,int phone){this.pb = new HashMap<>();}

    public String getContact(String contact){
        String s;
         s = pb.get(contact).toString();
        return s;
    }

    public void addContact(String contact, int phone) {
        HashSet<Integer> phones;
        if (pb.containsKey(contact)){
            phones = pb.get(contact);
        }else {
            phones = new HashSet<>();
        }
        phones.add(phone);
        pb.put(contact,phones);
    }
}

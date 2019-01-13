/**
 * Java.2.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson3.Ex1;

import Lesson3.Family;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int i =0;
        ArrayList<String> ai = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (Family s: Family.values()) {
            ai.add(s.getFamily());
            hs.add(s.getFamily());
        }
        System.out.println("Список фамилий:\n" + ai + "\nСписок уникальных фамилий: \n" + hs);
        for (String s : ai) {
            i=1;
            if (hm.keySet().contains(s)){
                i++;
                hm.put(s,i);
            }else {hm.put(s,i);}
        }
        System.out.println("Список фамилий с количеством упоминаний:\n" + hm);
    }
}

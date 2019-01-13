/**
 * Java.2.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 * generator Family :
 * http://megagenerator.ru/namefio/
 */
package Lesson3.Ex2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        Random ran = new Random();

        String[] family = {
                "Яхимович", "Осин", "Низов", "Злобин", "Дубровин", "Кирпа", "Островерх",
                "Шишмарёв", "Толбугин", "Топорков", "Грузов", "Калашник", "Ягодин",
                "Родзянко", "Сукин", "Каунайте", "Прокашев", "Чемерис", "Жикин", "Балунов"};
        int[] phone = {
                797467300, 791734425, 794975165, 792258210, 795130302, 798130716, 795675279, 791494070,
                792668141, 796586539, 792192430, 797689149, 792784959, 797605867, 791176722, 798699054,
                798014580, 794958651, 792590372, 794561231, 799335901, 793436971, 796190979, 798837915, 798872983};
        for (int i = 0; i <family.length ; i++) {
            phoneBook.addContact(family[i],phone[i]);
        }
        String person = "Дубровин";
//        System.out.println(ran.nextInt(phone.length - family.length) + family.length);
        int personPhone = phone[ran.nextInt(phone.length - family.length) + family.length];

        System.out.println("Добавим телефон " + person + "\n" + phoneBook.getContact(person));
        phoneBook.addContact(person,personPhone);
        System.out.println("Вывод телефонов " + person + "\n" + phoneBook.getContact(person));

    }
}

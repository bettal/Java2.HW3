/**
 * Java.2.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 *
 * generator Family :
 * http://megagenerator.ru/namefio/
 */
package Lesson3;

public enum Family {
    Family1("Bruce"),
    Family2("Bishop"),
    Family3("Scott"),
    Family4("Washington"),
    Family5("Bishop"),
    Family6("Booker"),
    Family7("Gilbert"),
    Family8("Caldwell"),
    Family9("Terry"),
    Family10("Lawson"),
    Family11("Tucker"),
    Family12("Scott"),
    Family13("Dean"),
    Family14("Gilbert"),
    Family15("Gardner"),
    Family16("Stafford"),
    Family17("Hancock"),
    Family18("Walton"),
    Family19("Scott"),
    Family20("Stanley");

    private String family;

    Family(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

}

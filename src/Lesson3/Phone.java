/**
 * Java.2.Lesson.3.Homework
 *
 * @autor Stanislav Lyashov
 *
 * generator Phone:
 * http://megagenerator.ru/numbers/
 */
package Lesson3;

import java.util.Arrays;

public enum Phone {
    Fam1(790102718),
    Fam2(794233010),
    Fam3(793382350),
    Fam4(791321325),
    Fam5(796589817),
    Fam6(797358095),
    Fam7(795991823),
    Fam8(793452011),
    Fam9(792742121),
    Fam10(799792184),
    Fam11(792898042),
    Fam12(792047930),
    Fam13(794521710),
    Fam14(797244074),
    Fam15(799048634),
    Fam16(792703725),
    Fam17(796822230),
    Fam18(796728456),
    Fam19(790990088),
    Fam20(790853580),
    Fam21(799998375),
    Fam22(795007931),
    Fam23(793718177),
    Fam24(790104669),
    Fam25(799449942);
     private int phone;

    Phone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }
}

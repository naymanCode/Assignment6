package kz.aitu.oop.assingment2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Element vector1 = new integerV(1,2);
    Element vector2 = new integerV();
    vector2.setInt(3,3);
        System.out.println("First vector : "+vector1.x + ":"+ vector1.y);
        System.out.println("Second vector : "+vector2.x + ":"+ vector2.y);
    vector1.addition(vector2);
    Integer q = new Integer(11);
    float f=q.floatValue();
    Element vector3 = new floatV(1.1f,f);
    Element vector4 = new floatV();
    vector4.setFloat(3.3f,4.4f);
    vector3.multi(vector4);
        System.out.println(vector1);
    }
}

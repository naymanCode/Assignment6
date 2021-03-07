package kz.aitu.oop.assingment1;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        LineSegment first = new LineSegment(1,2,3,4);
        first.print();
        first.Length();
        int[] mass1={first.Ax, first.Ay, first.Bx, first.By};
        LineSegment second = new LineSegment();
        second.setLS(5, 5 , 6, 6);
        int[] mass2={second.Ax, second.Ay, second.Bx, second.By};
        second.print();
        second.Length();
        LineSegment.Distance(mass1[0], mass1[1], mass1[2],mass1[3],mass2[0], mass2[1], mass2[2],mass2[3]);
    }

}

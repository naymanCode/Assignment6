package kz.aitu.oop.assingment3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int cel;
        BaseConnect BD = new MySQL();
        BD.Connect();
        BD.execSQL();
        Scanner n = new Scanner(System.in);
        cel=n.nextInt();
        BaseConverter Calc = new Kelvins();
        Calc.convert(cel);
    }
}
package kz.aitu.oop.assingment3;

public class Fahrenheit implements BaseConverter{
    @Override
    public void convert(int celsius) {
        System.out.println(celsius +" celsius in Fahrenheit: " + (celsius*1.8+32) + "°F");
    }
}

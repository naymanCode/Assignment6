package kz.aitu.oop.assingment3;

public class Newton implements BaseConverter{
    @Override
    public void convert(int celsius) {
        System.out.println(celsius+" celsius in Kelvins: " + (celsius*100/33) + "°N");
    }
}

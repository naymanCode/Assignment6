package kz.aitu.oop.assingment3;

public class Kelvins implements BaseConverter{
    @Override
    public void convert(int celsius) {
        System.out.println(celsius+" celsius in Kelvins: " + ((celsius)+273) + "°K");
    }
}

package kz.aitu.oop.assingment2;

public class floatV extends Element{
    public floatV(float x, float y){
        super.xf = x;
        super.yf = y; };
    public floatV(){};
    public void setFloat(float x, float y){
        super.xf = x;
        super.yf = y; };
    @Override
    public void addition(Element v2) {
        System.out.println((xf+v2.xf) + " : "+ (yf+v2.yf));
    }
    public void sub(Element v2) {
        System.out.println((xf-v2.xf) + " : "+ (yf-v2.yf));
    }
    public void multi(Element v2) {
        System.out.println((xf*v2.xf) + " : "+ (yf*v2.yf));
    }
}

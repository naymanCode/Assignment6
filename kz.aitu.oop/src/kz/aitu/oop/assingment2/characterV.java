package kz.aitu.oop.assingment2;

public class characterV extends Element{
    public characterV(char x, char y){
        super.xc = x;
        super.yc = y; };
    public characterV(){};
    public void setChar(char x, char y){
        super.xc = x;
        super.yc = y; };
    @Override
    public void addition(Element v2) {
        System.out.println((xc+v2.xc) + " : "+ (yc+v2.yc));
    }
    public void sub(Element v2) {
        System.out.println((xc-v2.xc) + " : "+ (yc-v2.yc));
    }
    public void multi(Element v2) {
        System.out.println((xc*v2.xc) + " : "+ (yc*v2.yc));
    }
}

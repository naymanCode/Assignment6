package kz.aitu.oop.assingment2;

public class integerV extends Element{
    private int x0=0;
    private int y0=0;
    public integerV(int x, int y){
        super.x = x;
        super.y = y; };
    public integerV(){};
    public void setInt(int x, int y){
        super.x = x;
        super.y = y; };
    public String toString(){
        return "vector starts from coordinates "+ x0 + ":" + y0;
    };
    @Override
    public void addition(Element v2) {
        System.out.println((x+v2.x) + " : "+ (y+v2.y));
    }
    public void sub(Element v2) {
        System.out.println((x-v2.x) + " : "+ (y-v2.y));
    }
    public void multi(Element v2) {
        System.out.println((x*v2.x) + " : "+ (y*v2.y));
    }
}

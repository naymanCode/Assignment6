package kz.aitu.oop.assingment2;

public abstract class Element {
    int x,y;
    float xf,yf;
    char xc,yc;
    public void setInt(int x, int y){};
    public void setFloat(float x, float y){};
    public void setChar(char x, char y){};
    public void addition(Element v2){};
    public void sub(Element v2){};
    public void multi(Element v2){};
}

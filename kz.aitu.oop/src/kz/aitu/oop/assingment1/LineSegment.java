package kz.aitu.oop.assingment1;

public class LineSegment {
    int Ax,Ay,Bx,By;
    int[] first;
    public LineSegment(int Ax, int Ay, int Bx, int By){
        this.Ax = Ax;
        this.Ay = Ay;
        this.Bx = Bx;
        this.By = By;

    }

    public LineSegment(){};
    public void print(){
        System.out.println("The coordinate of the first point is ("+Ax+";"+Ay+") and of the second is ("+Bx+";"+By+").");
    }
    public void Length(){
        System.out.println("The Length of Line Segment is: " + Math.sqrt(Math.pow((Ax-Bx),2)+Math.pow((Ay-By),2)));
    }
    public void setLS(int Ax, int Ay, int Bx, int By){

        this.Ax = Ax;
        this.Ay = Ay;
        this.Bx = Bx;
        this.By = By;
    };
    static void Distance(int Ax, int Ay, int Bx, int By, int Ax2, int Ay2, int Bx2, int By2){
        int dx1,dy1,dx2,dy2;
        double distance;
        dx1 = (Ax+Bx)/2;
        dy1 = (Ay+By)/2;
        dx2 = (Ax2+Bx2)/2;
        dy2 = (Ay2+By2)/2;
        distance = Math.sqrt(Math.pow((dx1-dx2),2)+Math.pow((dy1-dx2),2));
        System.out.println("The Distance between 2 Segment is: "+distance);
    }
}

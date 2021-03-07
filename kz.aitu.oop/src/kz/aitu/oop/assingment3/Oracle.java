package kz.aitu.oop.assingment3;

public class Oracle implements BaseConnect{
    @Override
    public void Connect() {
        System.out.println("Connecting to Oracle...");
        System.out.println("successfully connected!");
    }
    @Override
    public void execSQL() {
        System.out.println("Executing query in Oracle");
        System.out.println("query was executed");
    }
}

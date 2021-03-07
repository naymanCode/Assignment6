package kz.aitu.oop.assingment3;

public class MSSql implements BaseConnect{
    @Override
    public void Connect() {
        System.out.println("Connecting to MSSql...");
        System.out.println("successfully connected!");
    }
    @Override
    public void execSQL() {
        System.out.println("Executing query in MSSql");
        System.out.println("query was executed");
    }
}

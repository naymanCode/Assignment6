package kz.aitu.oop.assingment3;

public class MySQL implements BaseConnect{
    @Override
    public void Connect() {
        System.out.println("Connecting to MySql...");
        System.out.println("successfully connected!");
    }
    @Override
    public void execSQL() {
        System.out.println("Executing query in MySql");
        System.out.println("query was executed");
    }
}

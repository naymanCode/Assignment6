package kz.aitu.oop.assingment3;

public class PostgreSQL implements BaseConnect{
    @Override
    public void Connect() {
        System.out.println("Connecting to PostgreSQL...");
        System.out.println("successfully connected!");
    }
    @Override
    public void execSQL() {
        System.out.println("Executing query in PostgreSQL");
        System.out.println("query was executed");
    }
}

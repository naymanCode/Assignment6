package kz.aitu.oop.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException  {
	String URL = "jdbc:postgresql://localhost:5432/newdatabase";
	String username="postgres";
	String password="samsung";
	Connection connection = null;
	Statement statement = null;
	PostgreSQL db = new PostgreSQL();
	connection = db.connect(URL, username, password);
	try {
		String query = "create table animal(id SERIAL, type varchar(30), call varchar(30)) ";
		statement=connection.createStatement();
		statement.executeUpdate(query);
		System.out.println("Finished");
	} catch (Exception e) {
		e.printStackTrace();

	}
	String[] str = {URL, username, password};
	db.execSQL("insert into animal(type, call) values ('Cat', 'Barsik')", str);
	db.execSQL("insert into animal(type, call) values ('Dog', 'Rex')", str);//INSERTS
	db.execSQL("update animal set call='Aktos' where id = '2'", str); //update
	db.execSQL("delete from animal where id = '1'", str); //delete
	connection.close();
	}
		
}

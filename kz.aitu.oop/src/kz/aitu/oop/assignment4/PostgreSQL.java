package kz.aitu.oop.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQL implements BaseConnect{

	@Override
	public Connection connect(String url, String user, String password) {
		Connection connection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection(url,user,password);
			if (connection != null) {
				System.out.print("Connected");
			} else {
				System.out.print("Not connected!");}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public String execSQL(String sql, String[] params) {
		Connection connection = null;
		Statement statement = null;
		PostgreSQL db = new PostgreSQL();
		connection = db.connect(params[0], params[1], params[2]);
		try {
			String query = sql;
			statement=connection.createStatement();
			statement.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return "done";
	}

	@Override
	public String execSQL(String sql, String[] params, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
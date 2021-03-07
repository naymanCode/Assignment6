package kz.aitu.oop.assignment4;

import java.sql.Connection;

public interface BaseConnect {
	public Connection connect (String url, String user, String password);
	public String execSQL (String sql, String [] params, Connection con);
}

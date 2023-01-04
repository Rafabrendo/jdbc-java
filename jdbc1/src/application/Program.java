package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//Todo o trabalho de implementar está na classe Db
		Connection conn = DB.getConnection();
		DB.closeConnection();
		
		
	}

}

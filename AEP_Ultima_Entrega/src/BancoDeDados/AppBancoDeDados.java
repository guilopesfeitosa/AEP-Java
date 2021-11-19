package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppBancoDeDados {
	
	public static void main(String[] args) throws SQLException {
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AEP_Esoft4s2021","Guilherme","2013gui187");
			System.out.println("foi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
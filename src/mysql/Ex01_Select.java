package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01_Select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", 
			        "mcuser", "mcpass");
			stmt = conn.createStatement();
			String sql ="Select * FROM city WHERE countrycode = 'kor' LIMIT 10;";
			
			//Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);		//첫번째 컬럼의 int타입값
				String name = rs.getString(2);	//2번째 컬럼의 String 값
				String countryCode = rs.getString(3);
				String district = rs.getString(4);
				int population = rs.getInt(5);
				System.out.printf("%d, %s, %s, %s, %d%n" , id, name, countryCode, district, population);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

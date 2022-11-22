package db_과제2_김윤호;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	EmployeeDao() {
		try {
			InputStream is = new FileInputStream("/workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
				e.printStackTrace();
	   	}
	}	
		
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public List<Employee> printAllEmployee() {
		Connection conn = myGetConnection();
		Statement stmt = null;
		List<Employee> list = new ArrayList<>();
		String sql = "SELECT * FROM employee ORDER BY joindate;";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPosition(rs.getString(3));
				e.setJoinDate(LocalDate.parse(rs.getString(4).substring(0,10)));
				list.add(e);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertEmployee(Employee emp) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO employee VALUES (?, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, emp.getId());
			pStmt.setString(2, emp.getName());
			pStmt.setString(3, emp.getPosition());
			pStmt.setString(4, emp.getJoinDate().toString());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void createTable() {
		Connection conn = myGetConnection();
		String sql = "CREATE TABLE employee"
				+ "("
				+ "	id int NOT NULL,"
				+ "	name varchar(4) NOT NULL,"
				+ "	position varchar(4) NOT NULL,"
				+ "	joinDate datetime,"
				+ "	PRIMARY KEY (id)"
				+ ");";
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

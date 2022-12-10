package mysql.kbo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.customer.Customer;

public class DAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	DAO () {
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
	
	public void insertPlayer(Player p) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO player VALUES (?, ?, ?, ?, ?,default);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, p.getBackNumber());
			pStmt.setString(2, p.getName());
			pStmt.setString(3, p.getPosition());
			pStmt.setString(4, p.getBday().toString());
			pStmt.setInt(5, p.getHeight());
						
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void deletePlayer(int backNumber) {
		Connection conn = myGetConnection();
		String sql = "UPDATE player SET isDeleted = 1 WHERE backNumber = ?;";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNumber);
			
			//delete 대상 대신에 isDeleted 필드를 1로 변경하는 것으로 대신함
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updatePlayer(Player p) {
		Connection conn = myGetConnection();		
		String sql = "UPDATE player SET name = ?, position = ?, bday = ?, height = ?, isDeleted = ? WHERE backNumber = ?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, p.getName());
			pStmt.setString(2, p.getPosition());
			pStmt.setString(3, p.getBday().toString());
			pStmt.setInt(4, p.getHeight());			
			pStmt.setInt(5, p.getIsDeleted());			
			pStmt.setInt(6, p.getBackNumber());			
			
			//Update 실행
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Player getPlayer (int backNumber) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM Player WHERE backNumber=?;";
		Player p = new Player();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNumber);
			
			//select 실행
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				p.setBackNumber(rs.getInt(1));
				p.setName(rs.getNString(2));
				p.setPosition(rs.getString(3));
				p.setBday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public List<Player> getPlayers() {
		Connection conn = myGetConnection();
		
		List<Player> list = new ArrayList<>();
		String sql = "SELECT * FROM Player WHERE isdeleted=0;";
		try {
			Statement stmt = conn.createStatement();			
			
			//select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Player p = new Player();
				p.setBackNumber(rs.getInt(1));
				p.setName(rs.getNString(2));
				p.setPosition(rs.getString(3));
				p.setBday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
				list.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
}

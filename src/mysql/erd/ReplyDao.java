package mysql.erd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReplyDao {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;
	
	ReplyDao() {
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
	
	public void deleteReply(int bid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM reply WHERE bid = ?;";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void updateReply(Reply r) {
		Connection conn = myGetConnection();		
		String sql = "UPDATE reply SET rid = ? , rcontent = ?, regTime = NOW(), isMine = ?, bid =? WHERE uid = ?;";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, r.getRid());
			pStmt.setString(2, r.getRcontent());
			pStmt.setInt(3, r.getIsMine());
			pStmt.setInt(4, r.getBid());
			pStmt.setString(5, r.getUid());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Reply getReply(int bid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM reply WHERE bid=?;";
		Reply r = new Reply();
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				r.setRid(rs.getInt(1));
				r.setRcontent(rs.getString(2));
				r.setRegTime(LocalDateTime.parse(rs.getString(3).replace(" ", "T")));
				r.setIsMine(rs.getInt(4));
				r.setUid(rs.getString(5));
				r.setBid(rs.getInt(6));
			}
			
			rs.close();
			pStmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	public List<Reply> listReply() {
		Connection conn = myGetConnection();
		List<Reply> list = new ArrayList<>();
		String sql = "SELECT * FROM reply ORDER BY regTime, uid;";
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Reply r = new Reply();
				r.setRid(rs.getInt(1));
				r.setRcontent(rs.getString(2));
				r.setRegTime(LocalDateTime.parse(rs.getString(3).replace(" ", "T")));
				r.setIsMine(rs.getInt(4));
				r.setUid(rs.getString(5));
				r.setBid(rs.getInt(6));
				list.add(r);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void insertReply (Reply r) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO board VALUES (DEFAULT, ?, DEFAULT , DEFAULT , ?, ? );";
		
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setString(1, r.getRcontent());
			pStmt.setString(2, r.getUid());
			pStmt.setInt(3, r.getBid());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

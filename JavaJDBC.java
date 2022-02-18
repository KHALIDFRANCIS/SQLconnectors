package database;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public class JavaJDBC {
	
	public static void main(String[] args) throws Exception {
		getConnection();
//		createTable();
		updateTable();		 
	}
	
//	public static ArrayList<String> get() throws Exception {
//		try {
//			Connection conn = getConnection();
//			PreparedStatement statement = conn.prepareStatement("SELECT TITLE, RELEASE_YEAR FROM XBOX");
//			
//			ResultSet result = statement.executeQuery();
//			
//			ArrayList<String> games = new ArrayList<String>();
//			
////			retreive.executeUpdate();
//			
//		}catch(Exception e) {
//			System.out.println(e);
////			}finally {
//				System.out.println("Information successfully retreived");
//				}
//		
//	}
//	
	public static void createTable()  throws Exception{
		try {
			Connection connect  = getConnection();
			PreparedStatement create = connect.prepareStatement("CREATE TABLE PS5(id int NOT NULL AUTO_INCREMENT, title varchar(45) NOT NULL, release_year int(4) NOT NULL, rating VARCHAR(3) NOT NULL,  PRIMARY KEY(id))");
			create.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
//			}finally {
				System.out.println("Table successfully completed");
				}
		
	}
	
	public static void updateTable() throws Exception{
		
//		
//		 
		
		final String var1 = "F1 2021";
		final int var2 = 2021;
		final String var3 = "E";
		
		try {
			Connection conn  = getConnection();
			PreparedStatement update = conn.prepareStatement("INSERT INTO PS5(title, release_year, rating) VALUES (' " + var1 + " ', ' " + var2 + " ', ' " + var3 + " ')");
			update.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
			}finally {
				System.out.println("Table successfully updated");
			} 
	}
	
	public static void delete() throws Exception{
		try {
			Connection conn = getConnection();
			PreparedStatement delete = conn.prepareStatement("DROP TABLE XBOX");
			delete.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
//			}finally {
				System.out.println("Table successfully deleted");
				}
			
//		}catch(Exception e) {System.out.println(e);}
	}
	
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/GAMING";
			String username = "root";
			String password = "CARBON216-x";
			Class.forName(driver);
			
			Connection connect = DriverManager.getConnection(url,username,password);
//			Connection conn = DriverManager.getConnection(jdbc:mysql://67.80.222.129:1433/datatestbase",username,password);

			System.out.println("Connection successful");
			return connect;
		} catch(Exception x) {System.out.println(x);}
		
		return null;
	}

}

//*SIDENOTES.....

//YOU MUST CREATE THE TABLE FIRST....AND THEN CONNECT TO WHAT YOU CREATED*

//executeUpdate vs executeQuery
//executeQuery = receiving information
//executeUpdate = manipulating information




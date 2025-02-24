package jdbc.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllCity extends DatabaseUrl {

	public static void main(String[] args) {
		//try block
		try (
			Connection connection = DriverManager.getConnection(url, username,password);
			Statement statement = connection.createStatement();
			){
			
			//getQuery
			String getCityQuery = "SELECT * FROM CITY LIMIT 50";
			System.out.println(getCityQuery);
			
			try ( ResultSet resultSet = statement.executeQuery(getCityQuery);
					){
				boolean resultSetIsEmpity = true;
				while(resultSet.next() ) {
					resultSetIsEmpity = false;
				System.out.println(resultSet.getString(1)+"\t"+
									resultSet.getString(2)+"\t\t"+
									resultSet.getString(3)+"\t\t"+
									resultSet.getString(4)+"\t\t"+
									resultSet.getString(5)
									);
				}//while
				if(resultSetIsEmpity == false) {
					System.out.println("printed");
					
				}else{
					System.out.println("Table is empity");
					
				}//else
			}//try
			
		}catch(SQLException sq) {
			sq.printStackTrace();
		}//catch
		catch (Exception e) {
			e.printStackTrace();
		}//catch
		

	}//main

}//classs

package jdbc.excercise;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App extends DatabaseUrl {
	
    public static void main(String[] args) {
    	
        System.out.println("Welcome World!");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
        	
        //Load the Class
        //Class.forName("com.mysql.cj.jdbc.Driver");
        	
        //establish the Connection
        connection = DriverManager.getConnection(url, username, password);
        
        //create the statement object
        statement = connection.createStatement();
        
        //create the query
        String query = "SELECT * FROM CITY LIMIT 50";
        System.out.println(query);
        
        //resultSet
        resultSet = statement.executeQuery(query);
        
        while(resultSet.next()) {
        	System.out.println(resultSet.getInt(1)+ "\t "+
        			           resultSet.getString(2)+"\t "+
        			           resultSet.getString(3)+"\t "+
        			           resultSet.getString(4)+"\t "+
        			           resultSet.getString(5)
        			       		        			           
        			);
        }
        
        }
        catch(Exception e) {
        	e.printStackTrace();
        	
        }
        finally {
        	try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
    }
}

package counter_application;
import java.sql.*;

public class Items {
	
 static void main(String[] args) {
		
	 try {
		 String queryString = "Select * from student";
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","0");
		 Statement statement = connection.createStatement();
		 ResultSet rSet = statement.executeQuery(queryString);
		 rSet.next();
		 String snameString = rSet.getString(2);
		 System.out.print(snameString);
	 
	 }
	 catch (Exception e) {
		// TODO: handle exception
	}
		
	}

}

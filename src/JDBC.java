import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "");
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery("select * from employees_tbl");
			
			while(result.next()) {
				result.getInt("salary");
			}
			
			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

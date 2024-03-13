import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:7009/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "password");
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery("select * from employees_tbl");
			
			int value = 0;
			
			while(result.next()) {
				value = Integer.parseInt(result.getString("salary"));
			}
			
			System.out.print(value);

			
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

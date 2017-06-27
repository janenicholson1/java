import java.sql.*;

class DBI {
	
	public static void main(String[] args) {
		try{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/ons","root","");
			Statement stm=con.createStatement();
			
			
			ResultSet rs = stm.executeQuery("Select * from asda where quantity > 2");
			
			while(rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				float price = rs.getFloat(3);
				int quantity = rs.getInt(4);
				System.out.println(pname +": £" + (quantity * price));
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch(SQLException s) {
			System.out.println("SQL Exception");
			s.printStackTrace();
		}
	}	
}

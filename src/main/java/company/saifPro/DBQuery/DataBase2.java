package company.saifPro.DBQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
public class DataBase2 {
	
	
	public Connection conn;
	public Statement stm;
	
	public Statement getStatement() throws ClassNotFoundException, SQLException
	{
		
		try {
			String connection = "";
			String driver = "";
			String uname="";
			String pass="";
			Class.forName(driver);
			conn=DriverManager.getConnection(connection, uname, pass);
			stm=conn.createStatement();
			return stm;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  stm;
		
	}
	
	
	public void insetQuery(String query) throws ClassNotFoundException, SQLException
	{
		 getStatement().executeUpdate(query)		;
	}
	
		



public void updateQuery(String query) throws SQLException, ClassNotFoundException
{
	
    Statement sta = getStatement();
    sta.executeUpdate(query);
    
}

public ResultSet selectQuery(String query) throws ClassNotFoundException, SQLException
{
return getStatement().executeQuery(query);	

}

}
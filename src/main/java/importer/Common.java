package importer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Common {
	private static Connection connection = null;
	
	public static void main(String[] args) {
		MysqlConnection conn = new MysqlConnection();
		conn.init();
		connection = conn.getConn();
		
		conn.close();
	}
}

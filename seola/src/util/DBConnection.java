package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn = null;

	public static Connection getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				String userId = "SCHOOL";
				String userPw = "kg";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				conn = DriverManager.getConnection(url, userId, userPw);
			} catch (SQLException e) {
				System.out.println("�α��� ������ URL�� Ȯ�����ּ���.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� �ε��� �� �����ϴ�.");
		}
		return conn;
	}

}

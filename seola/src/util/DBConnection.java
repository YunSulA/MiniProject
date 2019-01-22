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
				System.out.println("로그인 정보와 URL을 확인해주세요.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 로딩할 수 없습니다.");
		}
		return conn;
	}

}

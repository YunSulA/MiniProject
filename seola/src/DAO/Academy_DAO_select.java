package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnection;
import view.Button01;

public class Academy_DAO_select {
	public static int stdno[] = new int[20];
	static int i = 0;

	public Academy_DAO_select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = DBConnection.getConn();
		// 고객1,2,3 있음 DB에 정보도 이미 있음
		// 기본키는 고유번호
		// 고객1을 누르면 1의 정보를 출력
		String query = "SELECT STDNO FROM STUDENT";
		try {

			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				stdno[i] = rs.getInt(1);
				i++;
			}
			
			
			
			
			
			
			
//			for (int j = 0; j < stdno.length; j++) {
//				System.out.println(stdno[j]);
//			}
		} catch (SQLException e) {
			System.out.println("쿼리문에 오타가 발생하였습니다");
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}

		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = DBConnection.getConn();
		// 고객1,2,3 있음 DB에 정보도 이미 있음
		// 기본키는 고유번호
		// 고객1을 누르면 1의 정보를 출력
		String query = "SELECT STDNO FROM STUDENT";
		try {

			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				stdno[i] = rs.getInt(1);
				i++;
			}
			for (int j = 0; j < stdno.length; j++) {
				System.out.println(stdno[j]);
			}
		} catch (SQLException e) {
			System.out.println("쿼리문에 오타가 발생하였습니다");
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}

		}
	}

}

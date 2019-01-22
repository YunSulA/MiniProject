package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;
import view.Button01;

public class Academy_DAO_select {
	public static int sno[];
	public static String name[];
	public static String birth[];
	public static String tel[];
	public static String address[];
	public static String major[];
	public static String itcourse[];
	public static int tribute[];
	public static int db[];
	public static int java[];
	public static int javascript[];
	public static int jsp[];
	public static double attendance[];
	
	static int i = 0;

	public Academy_DAO_select() {
		Connection conn = null;
		ResultSet rs = null;

		conn = DBConnection.getConn();
		// 고객1,2,3 있음 DB에 정보도 이미 있음
		// 기본키는 고유번호
		// 고객1을 누르면 1의 정보를 출력
		
		 Statement pstmt = null;
			try {
				pstmt = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			} catch (SQLException e1) {
				System.out.println(e1.getMessage());
			}
		
		try {

			//pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery("SELECT * FROM ACADEMY ORDER BY SNO");
			rs.last();
			int cnt = rs.getRow();
			System.out.println(cnt);
			sno = new int[cnt];
			name =  new String[cnt];
			birth = new String[cnt];
			tel = new String[cnt];
			address = new String[cnt];
			major = new String[cnt];
			itcourse = new String[cnt];
			tribute = new int[cnt];
			db = new int[cnt];
			java = new int[cnt];
			javascript = new int[cnt];
			jsp = new int[cnt];
			attendance = new double[cnt];
			             
			
			rs.beforeFirst();
			while (rs.next()) {
				sno[i] = rs.getInt(1);
				name[i] = rs.getString(2);
				birth[i] = rs.getString(3);
				tel[i] = rs.getString(4);
				address[i] = rs.getString(5);
				major[i] = rs.getString(6);
				itcourse[i] = rs.getString(7);
				tribute[i] = rs.getInt(8);
				db[i] = rs.getInt(9);
				java[i] = rs.getInt(10);
				javascript[i] = rs.getInt(11);
				jsp[i] = rs.getInt(12);
				attendance[i] = rs.getDouble(13);
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
		Statement pstmt = null;
		ResultSet rs = null;

		conn = DBConnection.getConn();
		// 고객1,2,3 있음 DB에 정보도 이미 있음
		// 기본키는 고유번호
		// 고객1을 누르면 1의 정보를 출력
		
		try {
			
			rs = pstmt.executeQuery("SELECT * FROM ACADEMY");
			
			rs.last();
			int cnt = rs.getRow();
			System.out.println(cnt);
			sno = new int[20];
			name =  new String[20];
			rs.beforeFirst();
			while (rs.next()) { //getrow를 구하기위한 반복문
				
				sno[i] = rs.getInt(1);
				System.out.println(sno[i]);
				name[i] = rs.getString(2);
				System.out.println(name[i]);
				i++;
				
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





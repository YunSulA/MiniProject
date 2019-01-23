package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;
import view.Button_Guhyup;

public class Academy_DAO_select {
	public static boolean move = false;
	public static int sno;
	public static String name;
	public static String birth;
	public static String tel;
	public static String address;
	public static String major;
	public static String itcourse;
	public static int tribute;
	public static int db;
	public static int java;
	public static int javascript;
	public static int jsp;
	public static double attendance;
	public static int sno2;
	public static int cnt;

	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	
	static int i = 0;

	public Academy_DAO_select() {
		
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	public String selectGetName(int sno) {
		this.sno = sno;
		conn = DBConnection.getConn();
		
		try {
			pstmt = conn.prepareStatement("SELECT NAME FROM ACADEMY WHERE SNO = ?");
			System.out.println("확인");
			pstmt.setInt(1, this.sno);
			System.out.println("확인2");
			rs = pstmt.executeQuery();
			System.out.println("확인3");
			rs.next();
			name = rs.getString(1);
			System.out.println("확인4");		

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

		}return name;
	}

	
	public String selectGetBirth(int sno) {
		this.sno = sno;
		conn = DBConnection.getConn();
		
		try {
			pstmt = conn.prepareStatement("SELECT BIRTH FROM ACADEMY WHERE SNO = ?");
			pstmt.setInt(1, this.sno);
			rs = pstmt.executeQuery();
			rs.next();
			birth = rs.getString(1);
					

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

		}return birth;
	}

//	public static void main(String[] args) {
//		Connection conn = null;
//		ResultSet rs = null;
//
//		conn = DBConnection.getConn();
//		// 고객1,2,3 있음 DB에 정보도 이미 있음
//		// 기본키는 고유번호
//		// 고객1을 누르면 1의 정보를 출력
//
//		Statement pstmt = null;
//		try {
//			pstmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//		} catch (SQLException e1) {
//			System.out.println(e1.getMessage());
//		}
//
//		try {
//
//			// pstmt = conn.prepareStatement(query);
//			rs = pstmt.executeQuery("SELECT * FROM ACADEMY ORDER BY SNO");
//			rs.last();
//			int cnt = rs.getRow();
//			System.out.println(cnt);
//			sno = new int[cnt];
//			name = new String[cnt];
//			birth = new String[cnt];
//			tel = new String[cnt];
//			address = new String[cnt];
//			major = new String[cnt];
//			itcourse = new String[cnt];
//			tribute = new int[cnt];
//			db = new int[cnt];
//			java = new int[cnt];
//			javascript = new int[cnt];
//			jsp = new int[cnt];
//			attendance = new double[cnt];
//
//			rs.beforeFirst();
//
//			while (rs.next()) {
//				sno[i] = rs.getInt(1);
//				name[i] = rs.getString(2);
//				birth[i] = rs.getString(3);
//				tel[i] = rs.getString(4);
//				address[i] = rs.getString(5);
//				major[i] = rs.getString(6);
//				itcourse[i] = rs.getString(7);
//				tribute[i] = rs.getInt(8);
//				db[i] = rs.getInt(9);
//				java[i] = rs.getInt(10);
//				javascript[i] = rs.getInt(11);
//				jsp[i] = rs.getInt(12);
//				attendance[i] = rs.getDouble(13);
//				i++;
//				if (move == true) {
//					break;
//				}
//
//			}
//			System.out.println(sno[3]);
//
////				for (int j = 0; j < stdno.length; j++) {
////					System.out.println(stdno[j]);
////				}
//		} catch (SQLException e) {
//			System.out.println("쿼리문에 오타가 발생하였습니다");
//		} finally {
//			if (rs != null)
//				try {
//					rs.close();
//				} catch (SQLException e) {
//				}
//			if (pstmt != null)
//				try {
//					pstmt.close();
//				} catch (SQLException e) {
//				}
//			if (conn != null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//				}
//
//		}
//		Academy_DAO_select a =new Academy_DAO_select();
//		String text = a.selectGetName(4);
//		System.out.println(text);
//	}
}

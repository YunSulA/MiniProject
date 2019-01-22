package view;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBConnection;

public class TelSave {
	static int i = 0;
	static int j = 0;
	static int empno[] = new int[30];
	
	public TelSave() {

		Button01 button1 = new Button01();

		Connection conn = null; // 1.연결객체
		PreparedStatement pstate = null;// 2.상태객체
		ResultSet rs = null; // 3.결과객체

		try {

			conn = DBConnection.getConn();

			String query = "SElECT STDNO FROM STUDENT";
			pstate = conn.prepareStatement(query);

			rs = pstate.executeQuery();

			
			
			while (rs.next()) {
				empno[i] = rs.getInt(1);
				i++;
			}
			for (j = 0; j < empno.length; j++) {
				System.out.println(empno[j]);
			}

			
			
		} catch (SQLException e) {
			System.out.println("오라클 데이터베이스에 연결할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		} finally {
			// 자원반납(메모리 해제)
			try {
				// 연결,상태,결과 객체는 완료후 연결을 해제해야 한다
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
				if (pstate != null)
					pstate.close();

			} catch (SQLException e) {
			}

		}

	}
	public static void main(String[] args) {
		TelSave tel = new TelSave();
		
	}
}

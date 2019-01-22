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

		Connection conn = null; // 1.���ᰴü
		PreparedStatement pstate = null;// 2.���°�ü
		ResultSet rs = null; // 3.�����ü

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
			System.out.println("����Ŭ �����ͺ��̽��� ������ �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ������ �߻��߽��ϴ�.");
		} finally {
			// �ڿ��ݳ�(�޸� ����)
			try {
				// ����,����,��� ��ü�� �Ϸ��� ������ �����ؾ� �Ѵ�
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

package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Academy;
import util.DBResourceReturn;
import view.UiPanel01_1;
import view.UiPanel01_2;

public class Academy_DAO {
	public static int sno = 1;
	public static int[] selsno = new int[19];
	public static int selectsno;
	public static String selectname;
	public static String selectbirth;
	public static String selecttel;
	public static String selectaddress;
	public static String selectmajor;
	public static String selecttribute;
	public static String selectitcourse;
	public static int selectdatabase;
	public static int selectjava;
	public static int selectjavascript;
	public static int selectjsp;
	public static double selectattendance;
	public static String selectsurvey;
	public static String[] teloverlap = new String[20];
	public static int i = 0;

	private static Academy_DAO academyDao = new Academy_DAO();

	private Academy_DAO() {
	}

	public static Academy_DAO getInstance() {
		return academyDao;
	}

	public int addDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { // sno. name. birth. tel. address. major. tribute.
				// datascore.javascore.javascriptscore.jspscore.attendance.

			pstmt = conn
					.prepareStatement("INSERT INTO ACADEMY VALUES (4, ' ', ' ', ' ', ' ', ' ', 1,1,1,1,1, 1.5, '����')");
			return pstmt.executeUpdate();
			// �ܺ� ���̺��� �����ϴ� �׸� : attend
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

//	public int printDao(Connection conn, Academy academy) throws SQLException {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		 try {
//			 pstmt = conn.prepareStatement(SELECT )
//		 }
//	}

	public int changeNameDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET NAME=? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_1.nametext.getText()); // �ٲ��̸� �Է�. ����â�ȿ��� �̸��ʿ� ������ư�� ���� �Ŀ� �ߴ� �� �ؽ�Ʈ�ڽ��� �Է��� �� !
			pstmt.setInt(2, Academy.button_check); // ��� ��ư(��� ĳ��)�� �̸������� ��û�Ѱ��� Ȯ��. ���ư� sno������ٰ� �ߴµ� ���� ��Ȯ�� �ľǸ��ؼ� �ϴ� ����
													// ���� button_check �� Ȯ��
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeBirthDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET BIRTH=? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_1.birthtext.getText());
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeTelDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TEL=? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_1.teltext.getText());
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeAddressDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ADDRESS=? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_1.addresstext.getText());
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeMajorDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET MAJOR=? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_2.majortext.getText());
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeTributeDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TRIBUTE=? WHERE SNO=?");
			pstmt.setInt(1, Integer.parseInt(UiPanel01_2.tributetext.getText()));
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int chageItcourseDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ITCOURSE = ? WHERE SNO=?");
			pstmt.setString(1, UiPanel01_2.test2);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeDatabaseDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET DATABASE=? WHERE SNO=?");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeJavaDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVA=? WHERE SNO=?");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeJavascriptDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVASCRIPT=? WHERE SNO=?");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeJspDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JSP=? WHERE SNO=?");
			pstmt.setInt(1, 1);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeAttendanceDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ATTENDANCE=? WHERE SNO=?");
			pstmt.setDouble(1, 1.5);
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	public int changeSurveyDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET SURVEY=? WHERE SNO=?");
			pstmt.setString(1, " ");
			pstmt.setInt(2, Academy.button_check);
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	////////////////////////////////////////////////////////////////////////////////////////////
	// �� Change (�� ����) Dao. �� Remove (Delete - �л� ����) Dao
	////////////////////////////////////////////////////////////////////////////////////////////

//	public int removeDao(Connection conn, Academy academy) throws SQLException {
//		PreparedStatement pstmt = null;
//		
//		try {
//			pstmt=conn.prepareStatement("DELETE FROM ACADEMY WHERE SNO=?");
//			pstmt.setString(1, view.t1.getText());
//			System.out.println(view.t1.getText());
//			return pstmt.executeUpdate();
//		} finally {
//			DBResourceReturn.close(pstmt);
//		}
//	}

	////////////////////////////////////////////////////////////////////////////////////////////
	// �� Select (��ȸ �� ����� ����) Dao
	////////////////////////////////////////////////////////////////////////////////////////////

	public void selectDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT * FROM ACADEMY WHERE SNO=?");
			pstmt.setInt(1, Academy.button_check); // SNO - buttoncheck�� ��� �л����� üũ�� �Ŀ� .
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// sno. name. birth. tel. address. major. tribute.
				// datascore.javascore.javascriptscore.jspscore.attendance.

				/*
				 * ���⿡ �ִ� int sno , String name, �̷� �͵��� ���� ���Ƿ� ���� ���� ��������̰�, �ڵ忡 �����Ҷ��� Ui �гο�
				 * ������ ������ ����ؾ��ϴ� ���� rs.get~ �� ������ �ٷ� ����� �ǰ� �ϸ� �� �� ����.
				 */
				// Button01.selectsno = rs.getInt(1);
				selectname = rs.getString(2);
				selectbirth = rs.getString(3);
				selecttel = rs.getString(4);
				selectaddress = rs.getString(5);
				selectmajor = rs.getString(6);
				selectitcourse = rs.getString(7);
				selecttribute = Integer.toString(rs.getInt(8));// textarea�� ��Ʈ���ۿ� �ȵ��� �ҷ��ö� ��Ʈ������ �ٲ�..
				selectdatabase = rs.getInt(9);
				selectjava = rs.getInt(10);
				selectjavascript = rs.getInt(11);
				selectjsp = rs.getInt(12);
				selectattendance = rs.getDouble(13);
				selectsurvey = rs.getString(14);
			}
		} finally { // finally �κп��� �ݾ��ִ� �͵��� ���⼭�� rs�� �ݾƾ��ϴ°��� Ȯ���� �𸣰ڴ�. �Ƹ� �°���?
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstmt);
		}
	}

	public void selectSno(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT SNO FROM ACADEMY ORDER BY SNO");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				selsno[i] = rs.getInt(1);
				i++;
			}
	}finally {
		DBResourceReturn.close(rs);
		DBResourceReturn.close(pstmt);
	}
	}

	public void Teloverlap(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT TEL FROM ACADEMY");
			rs = pstmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				// sno. name. birth. tel. address. major. tribute.
				// datascore.javascore.javascriptscore.jspscore.attendance.
				teloverlap[i] = rs.getString(1);
				System.out.println(teloverlap[i]);
				i++;
			}
		} finally { // finally �κп��� �ݾ��ִ� �͵��� ���⼭�� rs�� �ݾƾ��ϴ°��� Ȯ���� �𸣰ڴ�. �Ƹ� �°���?
			DBResourceReturn.close(rs);
			DBResourceReturn.close(pstmt);
		}
	}

}
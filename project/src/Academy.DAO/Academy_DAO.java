package Academy.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Academy.model.Academy;
import Academy.util.DBResourceReturn;

public class Academy_DAO {
	private static Academy_DAO academyDao = new Academy_DAO();
	private Academy_DAO() { }
	public static Academy_DAO getInstance() {
		return academyDao;
	}
	
	public int addDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO ACADEMY VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, academy.getName());
			pstmt.setString(2, academy.getBirth());
			pstmt.setString(3, academy.getTel());
			pstmt.setString(4, academy.getAddress());
			pstmt.setString(5, academy.getMajor());
			pstmt.setString(6, academy.getItcourse());
			pstmt.setInt(7, academy.getTribute());
			pstmt.setInt(8, academy.getDatabaseScore());
			pstmt.setInt(9, academy.getJavaScore());
			pstmt.setInt(10, academy.getJavascriptScore());
			pstmt.setInt(11, academy.getJspScore());
			pstmt.setInt(12, academy.getAttendance());
			pstmt.setString(13, academy.getSurvey());
			return pstmt.executeUpdate();	
	// �̸� . �������. ��ȭ��ȣ. �ּ�. ����. �ܰ�������. ����Ƚ��. ����. �⼮. ��������
	// name. birth. tel. address. major. itcourse. tribute. database. java. javascript. jsp, attendance. survey				
	// �ܺ� ���̺��� �����ϴ� �׸� : attend 				
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int remove(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM ACADEMY WHERE TEL =?");
			pstmt.setString(1, /* �������� �л��� ��ȭ��ȣ�� �޾Ƽ� �̺κп� �Է�. */  );
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	// �ϴ� �ٸ� ����� �������� �ʾƼ� �׸񺰷� ���δ� change�޼ҵ带 ���� �ۼ��ϱ�� �ߴ�.
	/* 	private String name;
		private String birth;
		private String tel;
		private String address;
		private String major;
		private String itcourse;
		private int tribute;	// String���� ������ ���� ... ǰ���� ���´ٸ� 0�� 0
		private int databaseScore;
		private int JavaScore;
		private int JavascriptScore;
		private int JspScore;
		private int attendance;
		private String survey;		 */
	
	// UPDATE ���̺�� SET name = '����';
	public int changeNameDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET NAME=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� �̸��� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeBirthDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET BIRTH=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeTelDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TEL=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� ��ȭ��ȣ�� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeAddressDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ADDRESS=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� �ּҸ� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeMajorDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET MAJOR=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeItcourseDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ITCOURSE=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeTributeDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TRIBUTE=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� ����Ƚ���� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeDbscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET DATABASE=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� �����ͺ��̽� ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJavascoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVA=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� �ڹ� ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJavascriptscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVASCRIPT=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� �ڹٽ�ũ��Ʈ ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJspscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JSP=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� JSP ������ �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeAttendDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ATTENDANCE=? WHERE TEL =?)");
			pstmt.setInt(1, /* �ٲ� ��������� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeSurveyDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET SURVEY=? WHERE TEL =?)");
			pstmt.setString(1, /* �ٲ� ������������� �Է¹޾� �̰��� �ۼ� */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	
	
}

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
			// �̸� . �������. ��ȭ��ȣ. �ּ�. ����. �ܰ�������. ����Ƚ��. ����. �⼮. ��������
	// name. birth. tel. address. major. itcourse. tribute. scores. attend. survey
			// name. birth. tel. address. major. itcourse. tribute. database. java. javascript. jsp, attendance. survey		
			
			
	// �ܺ� ���̺��� �����ϴ� �׸� : attend 				
					
			return pstmt.executeUpdate();	
			
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}

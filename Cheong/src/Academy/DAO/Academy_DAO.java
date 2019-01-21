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
			pstmt = conn.prepareStatement("");
			// �̸� . �������. ��ȭ��ȣ. �ּ�. ����. �ܰ�������. ����Ƚ��. ����. �⼮. ��������
	// name. birth. tel. address. major. itcourse. tribute. scores. attend. survey
	// �ܺ� ���̺��� �����ϴ� �׸� : scores. attend 				
					
			return pstmt.executeUpdate();		
		} finally {
			DBResourceReturn.close(pstmt);
		}
		
		
	}
	
	
	
}

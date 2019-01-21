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
			// 이름 . 생년월일. 전화번호. 주소. 전공. 단과반유무. 조공횟수. 성적. 출석. 설문조사
	// name. birth. tel. address. major. itcourse. tribute. scores. attend. survey
	// 외부 테이블이 존재하는 항목 : scores. attend 				
					
			return pstmt.executeUpdate();		
		} finally {
			DBResourceReturn.close(pstmt);
		}
		
		
	}
	
	
	
}

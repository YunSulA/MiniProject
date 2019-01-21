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
			pstmt.setInt(8, academy.getScores());
			pstmt.setInt(9, academy.getAttend());
			pstmt.setString(10, academy.getSurvey());
			// 이름 . 생년월일. 전화번호. 주소. 전공. 단과반유무. 조공횟수. 성적. 출석. 설문조사
	// name. birth. tel. address. major. itcourse. tribute. scores. attend. survey
	// 외부 테이블이 존재하는 항목 : scores. attend 				
					
			return pstmt.executeUpdate();	
			
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
}
